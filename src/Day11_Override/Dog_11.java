package Day11_Override;

public class Dog_11 extends Animal_11 {
    // 부모의 cry()를 덮어씁니다.
    @Override
    public void cry() {
        System.out.println("멍멍! 🐶");
    }
}

