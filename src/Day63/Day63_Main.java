package Day63;

import java.util.function.*;

// 메모장으로 작성. 실행, 디버깅 미진행
public class Day63_Main {
    public static void main(String[] args) {
        Function<Double, Double> square = a -> Math.pow(a, 2);
        Function<Double, Double> sqrt = a -> Math.sqrt(a);

        double squareResult = square.apply(9.0);
        double sqrtResult = sqrt.apply(9.0);
        System.out.println(String.format("제곱 결과: %.1f\n제곱근 결과: %.1f", squareResult, sqrtResult));
    }
}