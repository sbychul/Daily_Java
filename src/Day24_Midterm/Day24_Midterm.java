package Day24_Midterm;

import java.util.Scanner;

public class Day24_Midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 포션 먹이기에 활용할 스캐너.
        Hero[] party = new Hero[2]; // 추상 클래스 Hero의 자손(기사, 마법사)가 담길 배열.

        party[0] = new Knight("바바리안", 100);
        party[1] = new Wizard("마법사", 60);

        System.out.println("=== 몬스터가 나타났다! ===");

        for (Hero h : party) { // 향상된 for문: party 변수에서 하나씩 꺼내 변수 h에 담아 사용.
            h.attack(); // h라는 변수에 들어갈 두 요소는 모두 Hero 추상 클래스에서 지시한 필수 기능 "attack()"을 가지고 있음.
                        // instanceof 필요 없이 그대로 공격 지시.
        }

        int drinkingGuy = 0; // 포션을 먹을 사람을 고를 때 사용할 변수. 매우 직관적인 변수 이름이라고 생각함.. 길긴 해도..
        System.out.print("포션을 먹일 영웅의 번호를 선택하세요 (0: 기사 / 1: 마법사): ");
        drinkingGuy = sc.nextInt();

        try {
            party[drinkingGuy].usePotion();
        } catch (ArrayIndexOutOfBoundsException e) { // 없는 번호를 입력하였을 때
            System.out.println("\uD83D\uDEA8 없는 영웅입니다! 턴을 날렸습니다.");
        }

        System.out.println("=== 전투 결과 ===");
        for (Hero h : party) { // 재탕
            h.showInfo();
        }

        sc.close(); // 스캐너 종료는 중요합니다.
    }
}
