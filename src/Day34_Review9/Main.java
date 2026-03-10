package Day34_Review9;

public class Main {
    public static void main(String[] args) {
        VocaManager myVoca = new VocaManager();
        myVoca.saveWord("apple", "사과");
        myVoca.saveWord("developer", "개발자");
        myVoca.showAllWords();
    }
}
