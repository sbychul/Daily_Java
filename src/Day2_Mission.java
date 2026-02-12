import java.util.Scanner;

public class Day2_Mission { // 이걸 빼먹음

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[수강 신청 시뮬레이션]");

        System.out.printf("과목명을 입력하세요: ");
        String subject = sc.next();

        System.out.printf("해당 과목의 학점을 입력하세요: ");
        int credit = sc.nextInt();

        System.out.printf("해당 과목의 학기를 입력하세요: ");
        double semester = sc.nextDouble();

        System.out.printf("%.1f학기 [%s]수업은 %d학점짜리 과목입니다.", semester, subject, credit);
        sc.close();
    }
}