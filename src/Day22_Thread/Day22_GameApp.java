package Day22_Thread;

public class Day22_GameApp {
    public static void main(String[] args) {
        MusicThread mt = new MusicThread();
        DownloadThread dt = new DownloadThread();

        System.out.println("[게임 앱 실행]");
        mt.start();
        dt.start();
    }
}
