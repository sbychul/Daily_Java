import java.util.Scanner;

public class Day3_Mission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("아이디 입력: ");
        String id = sc.next();
        System.out.printf("국어 점수: ");
        int korean_score = sc.nextInt();
        System.out.printf("수학 점수: ");
        int math_score = sc.nextInt();

        boolean isScorePassed = ((korean_score + math_score) / 2.0) >= 60.0;

        System.out.println("---------------------");
        System.out.println("관리자 인가요?: " + id.equals("1admin"));
        System.out.println("합격 인가요?: " + isScorePassed);
    }
}
