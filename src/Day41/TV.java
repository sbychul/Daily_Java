package Day41;

public class TV implements SmartDevice { // SmartDevice 인터페이스를 구현
    private String name;

    public TV(String name) { // 생성자
        this.name = name;
    }

    // SmartDevice 인터페이스에서 요구한 두 개의 메서드를 오버라이드(구현)
    // 요구된 문장을 출력하는 식의 메서드
    @Override
    public void turnOn() {
        System.out.printf("📺 [%s] TV의 화면이 켜집니다.%n", name);
    }

    @Override
    public void turnOff() {
        System.out.printf("📺 [%s] TV의 전원이 꺼집니다.%n", name);
    }
}
