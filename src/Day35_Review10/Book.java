package Day35_Review10;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) { // 생성자
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() { // toString 오버라이드
        return "[" + title + "] (저자: [" + author + "])";
    }
}
