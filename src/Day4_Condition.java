import java.util.Scanner;

public class Day4_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("=== 메뉴 자판기 ===%n1. 콜라 2. 사이다 3. 커피%n메뉴 번호를 입력하세요: ");
        int menu = sc.nextInt();

        // 1. If-else 문 (범위 체크에 유리)
        if (menu < 1 || menu > 3) {
            System.out.println("경고: 없는 메뉴입니다.");
        }
        else {
            System.out.println("메뉴가 정상적으로 선택되었습니다.");
        }

        // 2. Switch 문 (값 매칭에 유리) - Modern Style
        // 설명: 1을 입력하면 -> 뒤의 코드가 실행되고 끝납니다.
        switch (menu) {
            case 1 -> System.out.println("주문하신 [콜라] 나왔습니다.");
            case 2 -> System.out.println("주문하신 [사이다] 나왔습니다.");
            case 3 -> System.out.println("주문하신 [커피] 나왔습니다.");
            default -> System.out.println("돈을 반환합니다.");
        }

        sc.close();
    }
}
