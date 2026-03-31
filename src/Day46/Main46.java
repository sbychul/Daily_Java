package Day46;

// 오늘의 실전 미션: "거래 내역 누적 시스템"
// 지난 14일 차(Day 45)에 만든 소스뱅크는 완벽하게 돈이 오갔지만, '내가 언제, 얼마를 넣고 뺐는지' 확인할 방법이 없었습니다.
// 은행 앱에서 가장 많이 보는 화면이 바로 '거래 내역'이죠?
// 오늘은 각 계좌(Account) 객체가 자기만의 비밀 수첩(ArrayList)을 품게 만들어서, 입출금이 일어날 때마다 영수증을 꼬박꼬박 모아두는 시스템을 만들어 보겠습니다.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManager46 sossBank = new BankManager46(); // 객체 생성
        System.out.printf("--- \uD83C\uDFE6 소스뱅크 ---%n");

        soBank: while (true) { // 무한 루프
            System.out.printf("%n1. 계좌 개설 | 2. 입금 | 3. 출금 | 4. 계좌 이체 | 5. 거래내역 조회 | 6. 종료%n선택: ");
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
                    case 5 -> { // 거래내역 조회
                        System.out.print("조회할 계좌번호: ");
                        String accNum = sc.next();
                        sossBank.showHistory(accNum);
                    }
                    case 6 -> { // 종료
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
