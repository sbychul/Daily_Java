package Day7_8_Class;

public class Car {
    // 1. 필드 (Field): 상태/데이터 (C언어의 구조체 멤버와 비슷)
    String model;
    int speed;

    // 2. 메서드 (Method): 행동/기능 (함수)
    void drive() {
        System.out.println(model + "가 " + speed + "km/h로 달립니다!");
    }
}
