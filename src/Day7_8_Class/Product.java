package Day7_8_Class;

public class Product {
    String name;
    int price;

    public Product(String name, int price) { // 생성자(Constructor)
        this.name = name; // this == self(Python)
        this.price = price;
    }

    void showInfo() {
        System.out.printf("상품명: [%s], 가격: [%d]원%n", name, price);
    }
}
