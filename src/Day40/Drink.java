package Day40;

public class Drink {
    private String name;    // 이름
    private int price;      // 가격
    private int stock;      // 재고 수량

    public Drink(String name, int price, int stock) { // 생성자
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // 재고를 1 줄이는 메서드
    public void reduceStock() {
        stock--;
    }

    @Override // toString 오버라이드
    public String toString() {
        return "[" + name + "] 가격: [" + price + "]원 (남은 재고: [" + stock + "]개)";
        // "[음료명] 가격: [price]원 (남은 재고: [stock]개)" 형식으로 반환.
    }
}
