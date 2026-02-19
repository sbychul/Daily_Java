package Day16_Exception;

public class Day16_Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30}; // 인덱스는 0, 1, 2까지만 있음

        System.out.println("=== 프로그램 시작 ===");

        try {
            System.out.println("첫 번째 숫자: " + numbers[0]);
            System.out.println("네 번째 숫자: " + numbers[3]); // 💣 에러 발생! (인덱스 3은 없음)
            System.out.println("이 문장은 출력될까요?"); // 폭탄이 터진 직후의 코드는 무시됨.
        }
        catch (ArrayIndexOutOfBoundsException e) { // 에러가 터졌을 때 수습하는 코드
            System.out.println("🚨 에러 발생: 배열의 크기를 벗어났습니다!");
            // e.getMessage() 를 쓰면 자바가 알려주는 진짜 에러 이유를 볼 수 있습니다.
            System.out.println("상세 이유: " + e.getMessage());
            // Index 3 out of bounds for length 3 라고 출력됨. 3은 범위를 벗어났기 때문.
        }

        // 프로그램이 죽지 않고 여기까지 무사히 도달합니다.
        System.out.println("=== 프로그램 정상 종료 ===");
    }
}