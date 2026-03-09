package Day33_Review8;

public class Book extends Item {
    private String author; // 추가 필드 author

    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author; // 이름과 가격을 받는 부분은 유지하되, 저자를 입력하는 부분을 추가.
    }

    @Override
    public void showInfo() {
        System.out.printf("[책] [%s] (저자: [%s]) - [%d]원%n", getName(), author, getPrice());
        // 이름과 가격은 private이기 때문에 Getter 메서드를 사용하여 가져와야 함.
    }
}
