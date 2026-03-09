package Day33_Review8;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) { // 생성자
        this.name = name;
        this.price = price;
    }

    public void showInfo() { // "[상품명] 가격: [가격]원" 형식으로 출력
        System.out.printf("[%s] 가격 [%d]원%n", name, price);
    }

    // 가격(price)과 상품명(name)을 바깥에서 읽을 수 있도록 만든 Getter 메서드.
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
