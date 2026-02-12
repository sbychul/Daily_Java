import java.util.Scanner;

public class Day6_Mission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("학생 수를 입력하세요: ");
        int students = sc.nextInt();
        if (students < 1) { // 예외 처리
            System.out.printf("입력된 학생 수가 올바르지 않습니다.");
        }
        
        else {
            double avg = 0.0;
            int max = 0, min = 100; // 평균, 최대, 최솟값 변수 형성
            // 초기값을 안전하게 형성하기: Integer 상수 활용
            // int max = Integer.MAX_VALUE; (21억...)
            // int min = Integer.MIN_VALUE; (-21억...)
            int[] score_sheet = new int[students];

            for (int i = 0; i < students; i++) { // 점수 입력과 동시에 합계 계산, 최댓값, 최솟값 찾기
                System.out.printf("%d번째 학생의 점수를 입력하세요: ", i + 1);
                score_sheet[i] = sc.nextInt();

                avg += score_sheet[i]; // 평균 계산을 위한 합계 계산
                if (max < score_sheet[i]) { max = score_sheet[i]; } // 최댓값 찾기
                if (min > score_sheet[i]) { min = score_sheet[i]; } // 최솟값 찾기
            }
            avg = avg / students;
            System.out.printf("%n---------------------%n평균: %.1f점%n최고 점수: %d점%n최저 점수: %d점", avg, max, min);
        }
        sc.close(); // 스캐너 종료
    }
}
