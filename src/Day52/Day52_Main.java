package Day52;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day52_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 익명 클래스 numOp 정의
        NumericOperator numOp = new NumericOperator() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };

        // maxOp를 람다식으로 정의, operate 호출 시 해당 식으로 연산
        NumericOperator maxOp = (a, b) -> Math.max(a, b);

        try {
            System.out.print("숫자 1 입력: ");
            int num1 = sc.nextInt();
            System.out.print("숫자 2 입력: ");
            int num2 = sc.nextInt();

            // 호출부
            System.out.println(String.format("곱셈 계산 결과: %d", numOp.operate(num1, num2)));
            System.out.println(String.format("두 수 중에 더 큰 값: %d", maxOp.operate(num1, num2)));
        } catch (InputMismatchException e) {}
        sc.close();
    }
}
