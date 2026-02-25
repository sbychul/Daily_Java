package Day22_Thread;

// 1. Thread를 상속받습니다.
public class SubWorker extends Thread {

    // 2. run() 메서드를 오버라이딩하여 할 일을 적어줍니다.
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🤖 분신 일꾼: " + i + "번 째 업무 중...");
            try {
                Thread.sleep(1000); // 1초(1000ms) 대기
            } catch (InterruptedException e) {
                System.out.println("에러 발생!");
            }
        }
    }
}