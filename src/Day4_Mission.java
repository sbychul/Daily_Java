import java.util.Scanner;

public class Day4_Mission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("첫 번째 수: ");
        int n1 = sc.nextInt();
        System.out.printf("연산자(+, -, *, /): ");
        String op = sc.next();
        System.out.printf("두 번째 수: ");
        int n2 = sc.nextInt();

        switch (op) {
            case "+" -> System.out.printf("결과: %d", (n1 + n2));
            case "-" -> System.out.printf("결과: %d", (n1 - n2));
            case "*" -> System.out.printf("결과: %d", (n1 * n2));
            case "/" -> {
                if (n2 == 0) {
                    // '=='는 기본형 (int, double, boolean, char(소문자로 시작))를 비교할 때는 C와 똑같음.
                    // 참조형 (String, Class, Scanner(대문자로 시작))일 경우에는 주소를 비교하기 때문에 .equals()를 써야 함.
                    System.out.println("0으로는 나눌 수 없습니다.");
                } else {
                    System.out.printf("결과: %.1f", ((double) n1 / n2)); // double 캐스팅
                }
            }
            default -> System.out.println("잘못된 연산자입니다.");
        }
        // switch: "변수의 값에 따라 case를 찾아서 실행하고, 없으면 default로 간다."

        sc.close();
    }
}
