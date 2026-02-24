package Day21_Object;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "『" + title + "』 (저자: " + author + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book b) {
            if (this.title.equals(b.title) && this.author.equals(b.author)) {
                return true;
            }
        }
        return false;
    }
}
