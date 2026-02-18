package Day15_Interface;

public interface RemoteControl {
    // 1. 상수 (무조건 public static final)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 2. 추상 메서드 (무조건 public abstract)
    // "이 인터페이스를 쓰는 녀석들은 켜고 끄는 기능이 무조건 있어야 한다!"
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}