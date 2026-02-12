package Day7_8_Class;

import java.util.Scanner;

public class Day7_GameStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character c1 = new Character("sbc", "student", 100);
        // Day8 추가: 생성자가 있을 땐 칸을 비워주면 에러 발생.
        // 태어날 때 필수 정보(이름, 직업, 체력)을 무조건 쥐어줘야 함.

        System.out.printf("첫 번째 캐릭터 %s가 생성되었습니다.%n", c1.name);
        c1.introduce();
        c1.attack();

        System.out.println("------------------------------");

        Character c2 = new Character("aemeath", "resonator", 17000);
        System.out.printf("두 번째 캐릭터 %s가 생성되었습니다.%n", c2.name);
        c2.introduce();
        c2.attack();

        sc.close();
    }
}

// 오류로 인해 수정, 원래 이렇게 만들었었음.

//public class Day7_8_Class.Day7_GameStart {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Day7_8_Class.Character c1 = new Day7_8_Class.Character();
//        // Day8 추가: 생성자가 있을 땐 칸을 비워주면 에러 발생.
//        // 태어날 때 필수 정보(이름, 직업, 체력)을 무조건 쥐어줘야 함.
//        System.out.print("첫 번째 캐릭터명을 입력하세요: ");
//        c1.name = sc.next();
//        System.out.print("첫 번째 캐릭터의 직업을 입력하세요: ");
//        c1.job = sc.next();
//        System.out.print("첫 번째 캐릭터의 체력을 지정하세요: ");
//        c1.hp = sc.nextInt();
//
//        System.out.printf("첫 번째 캐릭터 %s가 생성되었습니다.%n", c1.name);
//        c1.introduce();
//        c1.attack();
//
//        System.out.println("------------------------------");
//
//        Day7_8_Class.Character c2 = new Day7_8_Class.Character();
//        System.out.print("두 번째 캐릭터명을 입력하세요: ");
//        c2.name = sc.next();
//        System.out.print("첫 번째 캐릭터의 직업을 입력하세요: ");
//        c2.job = sc.next();
//        System.out.print("첫 번째 캐릭터의 체력을 지정하세요: ");
//        c2.hp = sc.nextInt();
//
//        System.out.printf("두 번째 캐릭터 %s가 생성되었습니다.%n", c2.name);
//        c2.introduce();
//        c2.attack();
//
//        sc.close();
//    }
//}