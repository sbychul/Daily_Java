package Day16_Exception;

import java.util.Scanner;

public class Day16_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[나눗셈 계산기]");
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        try {
            int answer = num1 / num2; // 캐스팅을 하면 오류가 안 나요.. 밑 주석 참조.
            System.out.printf("결과: %d%n", answer);
        }
        catch (ArithmeticException e) { // e = exception; 에러 객체를 담는 변수 이름.
            System.out.println("0으로는 나눌 수 없습니다!");
        }

        System.out.println("계산기 프로그램이 종료되었습니다.");
        sc.close();
    }
}
// 🔍 원인 분석: "정수 세상" vs "실수 세상"
// 자바(그리고 대부분의 프로그래밍 언어)는 숫자를 나눌 때 **정수(int)**와 **실수(float/double)**를 완전히 다른 규칙으로 대합니다.

// 1. 정수 세상의 0 나누기 (int / int)
// 10 / 0
// 수학적으로 "절대 불가능!" -> 자바: "이건 에러야! ArithmeticException 발생!!" 💣

// 2. 실수 세상의 0 나누기 (float / int 또는 double / double)
// 10.0f / 0 (님이 작성하신 코드)
// 실수의 세계(IEEE 754 표준)에서는 "0에 한없이 가까워지는 수"로 나누는 것을 인정합니다.
// 자바: "아, 소수점이 있네? 이건 에러가 아니라 **무한대(Infinity)**지!" -> 에러 발생 안 함! 🕊️
