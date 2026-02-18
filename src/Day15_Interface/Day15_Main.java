package Day15_Interface;

public class Day15_Main {
    public static void main(String[] args) {
        // 인터페이스도 다형성이 됩니다! (부모 타입 역할)
        RemoteControl rc = new Tv();

        rc.turnOn();
        rc.setVolume(50); // MAX 제한 걸림
        rc.turnOff();
    }
}