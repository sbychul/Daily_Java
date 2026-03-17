package Day41;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartHomeHub myHome = new SmartHomeHub(); // 객체 생성
        System.out.printf("--- \uD83C\uDFE0 스마트홈 허브 ---%n");

        smartThings: while (true) { // 무한 루프
            System.out.printf("%n1. TV 연결 | 2. 에어컨 연결 | 3. 전체 켜기 | 4. 전체 끄기 | 5. 종료%n선택: ");
            int choice;

            try {
                choice = sc.nextInt();
                sc.nextLine(); // 버퍼 지우기

                switch (choice) {
                    case 1 -> { // TV 연결
                        System.out.print("TV 이름(위치): ");
                        String tvName = sc.nextLine();      // TV 이름을 받아서
                        myHome.addDevice(new TV(tvName));   // 새 TV 객체를 생성 및 리스트에 투입
                    }
                    case 2 -> { // 에어컨 연결, 방식 같으니 주석 생략.
                        System.out.print("에어컨 이름(위치): ");
                        String acName = sc.nextLine();
                        myHome.addDevice(new AirConditioner(acName));
                    }
                    case 3 -> myHome.turnOnAll();  // 전체 켜기
                    case 4 -> myHome.turnOffAll(); // 전체 끄기
                    case 5 -> {
                        System.out.println("프로그램을 종료합니다.");
                        break smartThings;
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
