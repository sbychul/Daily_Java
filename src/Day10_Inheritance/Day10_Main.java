package Day10_Inheritance;

public class Day10_Main {
    public static void main(String[] args) {
        HighStudent sbc = new HighStudent("sbc", 18);

        // 부모에게 물려받은 기능
        sbc.eat();      // 출력: sbc이(가) 급식을 먹습니다.
        sbc.sayHello(); // 출력: 안녕하세요, 저는 학생입니다.

        // 자식만의 기능
        sbc.studyForExam(); // 출력: sbc이(가) 야간 자율학습을 합니다. ㅠㅠ
    }
}