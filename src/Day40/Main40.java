package Day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine myMachine = new VendingMachine();
        System.out.printf("--- \uD83E\uDD16 스마트 자판기 ---%n");

        vendingMachine: while (true) {
            System.out.printf("%n1. 금액 투입 | 2. 메뉴 보기 | 3. 음료 구매 | 4. 반환 및 종료%n선택: ");
            int choice;

            try {
                choice = sc.nextInt();
                sc.nextLine(); // 버퍼 지우기

                switch (choice) {
                    case 1 -> { // 금액 투입
                        System.out.print("투입할 금액: ");
                        int myMoney = sc.nextInt();     // 금액을 입력받고
                        myMachine.insertMoney(myMoney); // 넣기
                        sc.nextLine();                  // 버퍼 지우기
                    }
                    case 2 -> { // 메뉴 보기
                        myMachine.showDrinks();
                    }
                    case 3 -> { // 음료 구매
                        System.out.print("음료 이름: ");
                        String iWantThis = sc.nextLine();   // 음료 이름을 입력받고
                        myMachine.buyDrink(iWantThis);      // 메서드에 맡기기
                    }
                    case 4 -> {
                        System.out.printf("남은 잔액 [%d]원이 반환됩니다. 자판기를 종료합니다.%n", myMachine.getBalance());
                        break vendingMachine;
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
