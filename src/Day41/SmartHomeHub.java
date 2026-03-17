package Day41;

import java.util.ArrayList;

public class SmartHomeHub { // 스마트홈 관리자
    private ArrayList<SmartDevice> devices = new ArrayList<>();
    // devices 리스트에 담을 것 == SmartDevice 인터페이스를 구현한(상속받은) 모든 클래스

    public void addDevice(SmartDevice device) { // 기기 추가
        devices.add(device); // devices 리스트에 새 device 추가.
        System.out.println("🔗 스마트 기기가 허브에 연결되었습니다.");
    }

    public void turnOnAll() {
        for (SmartDevice device : devices) { // for문을 돌며 리스트 내부에 있는 모든 기기를 작동
            device.turnOn();
        }
    }

    public void turnOffAll() {
        for (SmartDevice device : devices) { // for문을 돌며 리스트 내부에 있는 모든 기기를 종료
            device.turnOff();
        }
    }
}
