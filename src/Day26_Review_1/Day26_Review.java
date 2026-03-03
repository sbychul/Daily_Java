package Day26_Review_1;

import java.util.ArrayList;
import java.util.Scanner;

// 훈련 3: 나만의 펫 만들기
class Dog {
    String name; // 이름과 나이가 필요함.
    int age;

    public Dog(String name, int age) { // 생성자 형성. 처음 만들 때부터 이게 입력되지 않는다면 만들어지지 않음.
        this.name = name;
        this.age = age;
    }

    public void bark() { // bark 메서드 형성.
        System.out.printf("[%s]이(가) 멍멍 짖습니다!", name);
    }

}


public class Day26_Review {
    public static void main(String[] args) {
        // 훈련 1: 홀짝 판별기
        Scanner sc = new Scanner(System.in);

        System.out.printf("훈련 1: 홀짝 판별기(기본 입출력과 조건문)%n정수 하나를 입력하세요: ");
        int input = sc.nextInt(); // 스캐너를 통하여 변수 input에 정수 하나를 집어넣음

        if (input % 2 == 0) { // 2로 나눴을 때 나머지가 0이라면
            System.out.println("짝수입니다!");
        } else { // 아니라면
            System.out.println("홀수입니다!");
        }

        sc.close(); // 스캐너는 사용한 이후 항상 닫기

        // 훈련 2: 장바구니 담기
        System.out.println("훈련 2: 장바구니 담기(ArrayList와 반복문");
        ArrayList<String> cart = new ArrayList<>(); // ArrayList<(담을 것의 형식)> (배열명) = new ArrayList<>();

        cart.add("사과"); // (배열명).add를 통하여 담을 수 있음.
        cart.add("바나나");
        cart.add("오렌지");

        for (String fruits : cart) { // cart에서 String 형식의 물건들을 받아 변수 fruits에 담음. 다 담을 때까지 반복
            System.out.printf("%s%n", fruits);
        }

        // 훈련 3: 나만의 펫 만들기 출력을 위한 구역
        Dog dd = new Dog("누렁이", 3);
        dd.bark();
    }
}