package Day11_Override;

public class Cat_11 extends Animal_11 {
    @Override // 마찬가지로 덮어쓰기.
    public void cry() {
        System.out.println("야옹~ 🐱");
    }
}
