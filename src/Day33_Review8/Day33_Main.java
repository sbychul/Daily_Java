package Day33_Review8;

public class Day33_Main {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();
        Book javaClassics = new Book("자바의 정석", 30000, "남궁성");
        Electronics macbookPro = new Electronics("맥북 프로", 2500000, 12);

        myCart.addItem(javaClassics);
        myCart.addItem(macbookPro);
        myCart.printReceipt();
    }
}
