package Day45;

// 오늘의 실전 미션: "내 돈 내놔! 은행 계좌 관리 및 이체 시스템"
// 오늘의 핵심은 "객체와 객체 간의 상호작용(계좌 이체)"입니다.
// 자판기나 포스기는 손님과 기계 1:1의 거래였지만, 계좌 이체는 내 계좌(A)에서 돈이 빠져나가고,
// 남의 계좌(B)로 돈이 들어가는 2개의 상태 변화가 동시에 완벽하게 일어나야 합니다.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManager sossBank = new BankManager(); // 객체 생성
        System.out.printf("--- \uD83C\uDFE6 소스뱅크 ---%n");

        soBank: while (true) { // 무한 루프
            System.out.printf("%n1. 계좌 개설 | 2. 입금 | 3. 출금 | 4. 계좌 이체 | 5. 종료%n선택: ");
            int choice;

            try {
                choice = sc.nextInt();
                sc.nextLine(); // 버퍼 지우기

                switch (choice) {
                    case 1 -> { // 계좌 개설
                        System.out.print("계좌번호 설정: ");
                        String newAcc = sc.next(); // 계좌번호는 보통 띄어쓰기가 없지..
                        System.out.print("예금주명: ");
                        sc.nextLine(); // 버퍼 비우기
                        String newOwner = sc.nextLine(); // 이름은 띄어쓰기 되는거지
                        sossBank.createAccount(newAcc, newOwner);
                    }
                    case 2 -> { // 입금
                        System.out.print("입금할 계좌번호: ");
                        String acc = sc.next();
                        System.out.print("입금할 금액: ");
                        long amount = sc.nextLong();
                        sossBank.depositToAccount(acc, amount);
                    }
                    case 3 -> { // 출금
                        System.out.print("출금할 계좌번호: ");
                        String acc = sc.next();
                        System.out.print("출금할 금액: ");
                        long amount = sc.nextLong();
                        sossBank.withdrawFromAccount(acc, amount);
                    }
                    case 4 -> { // 계좌 이체(송금)
                        System.out.print("출금할 계좌번호: ");
                        String fromAcc = sc.next();
                        System.out.print("입금할 계좌번호: ");
                        String toAcc = sc.next();
                        System.out.print("이체할 금액: ");
                        long amount = sc.nextLong();
                        sossBank.transfer(fromAcc, toAcc, amount);
                    }
                    case 5 -> { // 종료
                        System.out.println("프로그램을 종료합니다.");
                        break soBank;
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
