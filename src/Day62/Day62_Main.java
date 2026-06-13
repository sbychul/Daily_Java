package Day62;

@FunctionalInterface
interface Calculate {
    int calculate(int a, int b);
}

// 메모장으로 작성. 실행, 디버깅 미진행
public class Day62_Main {
    public static void main(String[] args) {
        Calculate add = (a, b) -> a + b;
        Calculate sub = (a, b) -> a - b;
        Calculate div = (a, b) -> a / b;
        Calculate mul = (a, b) -> a * b;

        int addResult = add.calculate(6, 7);
        int subResult = sub.calculate(6, 7);
        int divResult = div.calculate(6, 2);
        int mulResult = mul.calculate(6, 7);

        System.out.println(String.format("[사칙연산 결과]\n덧셈: %d\n뺄셈: %d\n나눗셈: %d\n곱셈: %d", addResult, subResult, divResult, mulResult));
    }
}