package Day21_Object;

public class Day21_Library {
    public static void main(String[] args) {
        Book b1 = new Book("어린왕자", "생텍쥐페리");
        Book b2 = new Book("어린왕자", "생텍쥐페리");

        System.out.println(b1);

        System.out.printf("b1.equals(b2) 결과: %s", b1.equals(b2));
    }
}
