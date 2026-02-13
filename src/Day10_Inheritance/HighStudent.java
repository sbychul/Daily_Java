package Day10_Inheritance;

// Student의 기능을 모두 물려받음! (extends (부모 클래스))
public class HighStudent extends Student {

    // 생성자 (필수 아님, 편의상 추가)
    public HighStudent(String name, int age) {
        this.name = name; // 부모의 필드(name)를 내 것처럼 사용 가능
        this.age = age;
    }

    // 고등학생만의 기능 추가
    public void studyForExam() {
        System.out.println(name + "이(가) 야간 자율학습을 합니다. ㅠㅠ");
    }
}