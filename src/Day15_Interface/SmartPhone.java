package Day15_Interface;

public class SmartPhone implements Phone, Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("사진을 찍습니다.");
    }

    @Override
    public void recordVideo() {
        System.out.println("영상을 촬영합니다.");
    }

    @Override
    public void playMusic(String title) {
        System.out.printf("곡명 [%s]을(를) 재생합니다.%n", title);
    }

    @Override
    public void stopMusic() {
        System.out.println("노래 재생을 정지합니다.");
    }

    @Override
    public void call(String number) {
        System.out.printf("[%s]에게 전화를 연결하고 있습니다.%n", number);
    }

    @Override
    public void receive() {
        System.out.println("전화를 받습니다.");
    }
}
