package Day38;

import java.time.LocalDateTime;
import java.time.Duration;

public class Car {
    private String carNumber;
    LocalDateTime entryTime;

    public Car(String carNumber) {
        this.carNumber = carNumber;
        this.entryTime = LocalDateTime.now(); // 차가 객체로 만들어지는 순간의 시간이 저장됨
    }

    public String getCarNumber() {
        return carNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
