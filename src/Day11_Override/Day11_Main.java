package Day11_Override;

public class Day11_Main {
    public static void main(String[] args) {
        Dog_11 d = new Dog_11();
        Cat_11 c = new Cat_11();

        d.cry(); // 출력: 멍멍! 🐶 (부모의 "동물이 소리를 냅니다"가 아님)
        c.cry(); // 출력: 야옹~ 🐱
    }
}