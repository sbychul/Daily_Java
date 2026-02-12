import java.util.Scanner;

public class Day5_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 기본 for문 & while문 (C언어와 100% 동일)
        // 설명이 필요 없습니다. C언어 문법 그대로 복사해 오면 돌아갑니다.
        // For: for (int i = 0; i < 10; i++) { ... }
        // While: while (i < 10) { ... }

        System.out.println("=== 카운트다운 ===");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("발사!");


        // 2. While문 (조건 반복)
        System.out.println("\n=== 구구단 2단 ===");
        int j = 1;
        while (j <= 9) {
            System.out.printf("2 x %d = %d%n", j, 2 * j);
            j++;
        }
        // 추가로 do-while문 (Python엔 없는 녀석)
        // 조건이 거짓이어도 무조건 한 번은 실행하는 루프입니다. 주로 **"사용자가 올바른 값을 입력할 때까지 계속 물어보는 상황"**에서 씁니다.

        // do {
        //     System.out.print("점수를 입력하세요(0~100): ");
        //     score = sc.nextInt();
        // } while (score < 0 || score > 100); // 점수가 이상하면 다시 물어봄


        // 3. ⭐ 향상된 for문 (Enhanced For-Loop)
        // 오늘의 주인공입니다. Python의 for x in list:와 같은 역할을 합니다. 배열이나 리스트의 처음부터 끝까지 훑을 때 인덱스(i) 없이 값을 쏙쏙 꺼내옵니다.
        // Python: for name in names:
        // Java: for (String name : names) (콜론 :을 씁니다!)

        System.out.println("\n=== 배열 훑기 ===");
        // 자바에서 배열 만드는 법 (나중에 자세히 배웁니다)
        String[] fruits = {"사과", "바나나", "체리"};

        // 해석: fruits 배열에서 하나씩 꺼내 fruit 변수에 담는다.
        for (String fruit : fruits) {
            System.out.println("과일 이름: " + fruit);
        }

        sc.close();
    }
}