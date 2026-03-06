package Day30_Review5;

import java.util.ArrayList;
import java.util.HashMap;

// 훈련 1: "전국 지점의 돈을 하나로!" (static의 비밀)
class Bank {
    static int totalMoney = 0;
    void addMoney(int amount) {
        totalMoney += amount;
    }
}

// 훈련 2: "학생 명부 만들기" (사용자 정의 객체 ArrayList)
class Student {
    String name; // 이름과 학년을 가짐.
    int grade;

    public Student(String name, int grade) { // 생성자
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() { // Object 클래스의 toString() 메서드를 오버라이드.
        return "[" + grade + "]학년 [" + name + "] 학생입니다."; // 요구하는 문자열로 반환
    }
}


public class Day30_Review5 {
    public static void main(String[] args) {
        // 훈련 1: "전국 지점의 돈을 하나로!" (static의 비밀)
        Bank gangnam = new Bank();
        Bank hongdae = new Bank();

        gangnam.addMoney(1000);
        hongdae.addMoney(2000);
        System.out.printf("모든 지점이 가지고 있는 총 금액: %d%n", Bank.totalMoney);

        // 훈련 2: "학생 명부 만들기" (사용자 정의 객체 ArrayList)
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Max Verstappen", 3));
        students.add(new Student("Lando Norris", 1));

        for (Student formulaOne : students) {
            System.out.println(formulaOne);
        }

        // 훈련 3: "메뉴판 털기" (HashMap 전체 반복문)
        HashMap<Integer, String> menu = new HashMap<>();
        // 가격을 Key로 써버림... 이러면 같은 가격의 메뉴를 추가할 수 없게 되어 위험함.
        // 메뉴명을 Key로 설정하는 게 훨씬 안전하다는 것을 기억하길.

        menu.put(4500, "아메리카노");
        menu.put(5000, "카페라떼");
        menu.put(5500, "바닐라라떼");
        for (int price : menu.keySet()) {
            System.out.printf("%s의 가격은 %d원입니다.%n", menu.get(price), price);
        }
    }
}
