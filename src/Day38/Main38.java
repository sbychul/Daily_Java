package Day38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot lotteWorldMall = new ParkingLot(); // 요금이 쎄더라..

        theParkingLot: while (true) {
            System.out.printf("--- \uD83D\uDE08 악덕 주차장 ---%n1. 입차 | 2. 출차 | 3. 종료%n선택: ");
            int choice;

            try {
                choice = sc.nextInt();
                sc.nextLine(); // 버퍼 지우기

                switch (choice) {
                    case 1 -> { // 입차
                        System.out.print("차량번호: ");
                        String carNumber = sc.nextLine();
                        lotteWorldMall.parkCar(carNumber);
                    }
                    case 2 -> { // 출차
                        System.out.print("차량번호: ");
                        String carNumber = sc.nextLine();
                        lotteWorldMall.exitCar(carNumber);
                    }
                    case 3 -> {
                        System.out.println("프로그램을 종료합니다.");
                        break theParkingLot;
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
