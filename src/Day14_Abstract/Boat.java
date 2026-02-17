package Day14_Abstract;

public class Boat extends Vehicle {
    public Boat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.printf("[%s]이(가) 물살을 가릅니다. \uD83D\uDEE5\uFE0F%n", name);
    }
}
