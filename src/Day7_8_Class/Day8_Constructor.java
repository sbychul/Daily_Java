package Day7_8_Class;

public class Day8_Constructor {
    public static void main(String[] args) {
        // 이제 new Day7_8_Class.Character(); 처럼 괄호를 비우면 에러가 납니다!
        // 태어날 때 필수 정보(이름, 직업, 체력)를 무조건 줘야 합니다.
        Character c1 = new Character("sbc", "마법사", 100);
        Character c2 = new Character("자바고수", "전사", 150);

        c1.introduce();
        c2.introduce();
    }
}
