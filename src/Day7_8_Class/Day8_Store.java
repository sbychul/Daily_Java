package Day7_8_Class;

public class Day8_Store {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", 1200000);
        Product mouse = new Product("마우스", 35000);

        laptop.showInfo();
        mouse.showInfo();
    }
}
