package Day22_Thread;

public class MusicThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("🎵 배경 음악 재생 중...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("에러 발생!");
            }
        }
    }
}
