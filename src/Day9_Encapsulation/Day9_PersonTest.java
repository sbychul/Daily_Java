package Day9_Encapsulation;

public class Day9_PersonTest {
    public static void main(String[] args) {
        Person sbc = new Person("sbc");
        sbc.setAge(-10);
        sbc.setAge(200);
        sbc.setAge(21);
        System.out.println(sbc.getAge());
        // System.out.println(sbc.age); 이렇게 볼 수가 없음!! 왜?: 변수가 private이니까
        // java: age has private access in Day9.Encapsulation.Person 이라는 문구와 함께 실행 안 됨!
        // 무조건 메서드(getAge() 등, 클래스 파일 내의 함수)를 통해서만 정보에 접근 가능.
        // 자바에서는 변수는 숨기고(private), 메서드는 열어두는(public) 패턴을 공식처럼 사용.
        sbc.introduce();
    }
}
