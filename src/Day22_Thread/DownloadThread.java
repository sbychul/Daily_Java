package Day22_Thread;

public class DownloadThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 20) {
            System.out.printf("⬇️ 파일 다운로드 중... (%d%%)%n", i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("에러 발생!");
            }
        }
    }
}
