package Day22_Thread;

public class Day22_Main {
    public static void main(String[] args) {
        System.out.println("=== 프로그램 시작 ===");

        // 1. 분신 일꾼 생성
        SubWorker clone = new SubWorker();

        // 2. 분신에게 일 시키기 (반드시 start를 써야 분신술이 발동합니다!)
        clone.start();

        // 3. 메인 일꾼의 할 일
        for (int i = 1; i <= 5; i++) {
            System.out.println("😎 메인 일꾼: " + i + "번 째 업무 중...");
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                System.out.println("에러 발생!");
            }
        }

        System.out.println("=== 메인 일꾼 퇴근! ===");
    }
}