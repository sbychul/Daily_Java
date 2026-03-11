package Day35_Review10;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author) {
        Book addedBook = new Book(title, author); // 전달받은 제목과 저자로 새 Book 객체 생성.
        bookList.add(addedBook); // 만든 새 Book을 bookList에 저장.
        System.out.printf("📚 [%s] 도서가 등록되었습니다.%n", title); // 요구하는 문장 출력.
    }

    public void showAllBooks() {
        if (bookList.isEmpty()) { // 리스트가 비어 있다면
            System.out.println("🚨 등록된 도서가 없습니다.");
        } else { // 비어있지 않다면
            for (Book theBook : bookList) {
                System.out.println(theBook); // Override된 toString이 알아서 작동하며 문장 출력.
            }
        }
    }
}
