package Day43;

import java.util.InputMismatchException;
import java.util.Scanner;

// 오늘 만들 것이 42일차의 진화 버전이기 때문에 로직을 그대로 사용. 이건 42일차랑 완전히 똑같음!!
public class Main43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthManager43 googleDotCom = new AuthManager43(); // 객체 생성
        System.out.printf("--- \uD83D\uDD12 회원 인증 시스템 ---%n");

        google: while (true) { // 무한 루프
            System.out.printf("%n1. 회원가입 | 2. 로그인 | 3. 시스템 종료%n선택: ");
            int choice;

            try {
                choice = sc.nextInt();
                sc.nextLine(); // 버퍼 지우기

                switch (choice) {
                    case 1 -> { // 회원가입
                        System.out.print("아이디: ");
                        String newId = sc.next();       // 보통 아이디는 띄어쓰기가 안 되니까..
                        System.out.print("비밀번호: ");
                        String newPassword = sc.next(); // 비번도 마찬가지
                        System.out.print("이름: ");
                        sc.nextLine(); // 버퍼 비우기
                        String newName = sc.nextLine(); // 이름은 띄어쓰기 되지 않나
                        googleDotCom.register(newId, newPassword, newName);
                    }
                    case 2 -> { // 로그인
                        System.out.print("아이디: ");
                        String id = sc.next();
                        System.out.print("비밀번호: ");
                        String password = sc.next();
                        googleDotCom.login(id, password);
                    }
                    case 3 -> {
                        System.out.println("프로그램을 종료합니다.");
                        break google;
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
