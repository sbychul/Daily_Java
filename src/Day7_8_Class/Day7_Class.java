package Day7_8_Class;

public class Day7_Class {
    public static void main(String[] args) {
        // 1. 객체 생성 (붕어빵 찍어내기)
        Car myCar = new Car();

        // 2. 필드 값 설정 (점 . 찍고 접근)
        myCar.model = "테슬라";
        myCar.speed = 100;

        // 3. 메서드 호출 (운전해!)
        myCar.drive(); // 출력: 테슬라가 100km/h로 달립니다!

        // 객체는 여러 개 만들 수 있습니다 (독립적임)
        Car yourCar = new Car();
        yourCar.model = "모닝";
        yourCar.speed = 80;
        yourCar.drive();
    }
}
