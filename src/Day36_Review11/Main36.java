package Day36_Review11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager classGrades = new GradeManager();

        gradeProgram: while (true) {
            System.out.println("--- 성적 관리 메뉴 ---");
            System.out.println("1. 성적 등록 | 2. 성적 조회 | 3. 전체 평균 | 4. 종료");
            System.out.print("선택: ");
            int choice = 0;

            try { // 예외 처리가 하고 싶었음.
                // 하고 싶었는데, catch 이후로 무한 루프 현상이 계속 일어나길래
                // 어떻게 해결해야 할 지 잘 모르겠어서 catch 란에서 프로그램을 종료하는 식으로 마무리함.
                choice = sc.nextInt();
                sc.nextLine(); // Line을 받을 예정이기 때문에 입력 버퍼 제거.

                switch (choice) {
                    case 1 -> { // 이름과 점수를 입력받아 addGrade 호출
                        System.out.print("이름: ");
                        String name = sc.nextLine();
                        System.out.print("점수: ");
                        int score = sc.nextInt();
                        classGrades.addGrade(name, score);
                    }

                    case 2 -> { // 이름을 입력받아 searchGrade 호출
                        System.out.print("이름: ");
                        String name = sc.nextLine();
                        classGrades.searchGrade(name);
                    }

                    case 3 -> classGrades.showAverage(); // showAverage 호출

                    case 4 -> { // 무한 루프 탈출
                        System.out.println("프로그램을 종료합니다.");
                        sc.close();
                        break gradeProgram;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("\uD83D\uDEA8 오류가 발생하여 프로그램을 종료합니다.");
                System.out.println("원인: 입력 란에 올바른 형식이 입력되지 않았습니다.");
                break;
                // 무한 루프의 원인: nextInt()에서 잘못된 입력을 처리하지 못해서 계속 반복.
                // 해결법: 마찬가지로 입력 버퍼 제거(sc.nextLine())을 하면 무한 루프를 막을 수 있음.
            }
        }
    }
}
