package Day38;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.HashMap;

public class ParkingLot {
    private HashMap<String, Car> parkedCars = new HashMap<>();

    public void parkCar(String carNumber) { // 입차
        if (parkedCars.containsKey(carNumber)) { // 같은 번호의 차량이 있다면:
            System.out.println("🚨 이미 주차된 차량입니다.");
        } else { // 없다면: 새로운 Car 객체를 생성해서 맵에 추가.
            parkedCars.put(carNumber, new Car(carNumber));
            System.out.printf("🚗 [%s] 입차 완료!%n", carNumber);
        }
    }

    public void exitCar(String carNumber) { // 출차
        if (parkedCars.containsKey(carNumber)) {
            Car exitingCar= parkedCars.get(carNumber);
            long seconds = Duration.between(exitingCar.getEntryTime(), LocalDateTime.now()).getSeconds();
            long fare = seconds * 100;
            System.out.printf("\uD83D\uDCB8 [%s] 출차! 주차 시간: [%d]초, 결제 요금: [%d]원%n", carNumber, seconds, fare);
            parkedCars.remove(carNumber);
        } else {
            // 🚨 이 부분이 빠졌습니다!
            System.out.println("🚨 주차장에 없는 차량입니다.");
        }
    }
}
