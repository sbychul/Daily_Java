package Day14_Abstract;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.printf("[%s]이(가) 도로를 달립니다. \uD83D\uDE97%n", name);
    }
}
