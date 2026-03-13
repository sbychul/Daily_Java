package Day37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player warrior = new Player("전사");

        warriorKiosk: while (true) {
            int choice;
            System.out.printf("--- 용사 키오스크 ---%n1. 아이템 획득 | 2. 인벤토리 확인 | 3. 전투력 측정 | 4. 게임 종료%n선택: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // 버퍼 지우기

                switch (choice) {
                    case 1 -> { // 아이템 획득
                        System.out.print("아이템 이름: ");
                        String itemName = sc.nextLine();
                        System.out.print("전투력 수치: ");
                        int itemStat = sc.nextInt();
                        warrior.acquireItem(new Item(itemName, itemStat));
                        // 입력받은 정보를 토대로 새 아이템 객체 생성. 이후 acquireItem 메서드에 투입.
                    }
                    case 2 -> warrior.showInventory();
                    case 3 -> warrior.showTotalStat();
                    case 4 -> {
                        System.out.println("게임을 종료합니다.");
                        break warriorKiosk;
                    }
                }
            } catch (InputMismatchException e) { // 예외 처리
                System.out.println("\uD83D\uDEA8 올바른 형식이 입력되지 않았습니다. 처음으로 되돌아갑니다.");
                sc.nextLine(); // 버퍼 비우기
            }
        }
        sc.close(); // 스캐너 잊지 않고 종료하기.
    }
}
