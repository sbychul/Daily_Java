package Day17_Collection;
import java.util.ArrayList;

public class Day17_TodoList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("밥먹기");
        todoList.add("양치하기");
        todoList.add("잠자기");
        System.out.println("[오늘의 할 일]");

        int count = 1;
        for (String doit : todoList) {
            System.out.printf("%d. %s%n", count++, doit);
        }

        System.out.println("[첫 번째 할 일 완료!]");
        System.out.println("[남은 할 일]");

        count = 1;
        todoList.remove(0);
        for (String doit : todoList) {
            System.out.printf("%d. %s%n", count++, doit);
        }
    }
}
