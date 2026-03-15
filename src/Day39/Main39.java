package Day39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CafePOS starbucks = new CafePOS();

        stbksIsTooExpensive: while (true) {
            System.out.printf("--- ☕ 어서오고 ---%n1. 메뉴 주문 | 2. 결제 및 영수증 출력 | 3. 포스기 마감%n선택: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine(); // 버퍼 지우기

                switch (choice) {
                    case 1 -> { // 주문
                        System.out.print("메뉴 이름: ");
                        String menuName = sc.nextLine();
                        System.out.print("가격: ");
                        int menuPrice = sc.nextInt();
                        starbucks.addmenu(menuName, menuPrice);
                    }
                    case 2 -> starbucks.payAndPrintReceipt(); // 결제
                    case 3 -> { // 끄기
                        System.out.println("프로그램을 종료합니다.");
                        break stbksIsTooExpensive;
                    }
                    default -> System.out.println("올바른 번호를 입력해 주세요.");
                }
            } catch (InputMismatchException e) { // 예외 처리
                System.out.println("\uD83D\uDEA8 올바른 형식이 입력되지 않았습니다. 처음으로 되돌아갑니다.");
                sc.nextLine(); // 버퍼 비우기
            }
        }
        sc.close(); // 스캐너 잊지 않고 종료하기.
    }
}
