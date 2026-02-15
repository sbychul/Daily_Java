package Day12_Upcasting;

public class Computer extends Product {
    // ✅ 생성자에서 "물려받은 변수"에 값 넣기
    public Computer() {
        super.name = "Samsung-PC"; // 부모님(super) 상자에 넣기
        super.price = 1000000;
    }
}
