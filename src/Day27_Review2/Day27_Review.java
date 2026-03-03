package Day27_Review2;

import java.util.HashMap;

// 훈련 3: 동물원 상속 (클래스 상속과 오버라이딩)
class Animal { // Animal이라는 부모 클래스.
    void makeSound() { // makeSound() 라는 메서드를 기본적으로 가지고 있음.
        System.out.println("동물 소리..");
    }
}

class Cat extends Animal { // Animal 클래스를 상속받은 Cat 클래스.
    @Override // 덮어씌우겠다.
    void makeSound() { // 이 메서드를.
        System.out.println("야옹!");
    }
}

public class Day27_Review {
    public static void main(String[] args) {
        // 훈련 1: "나만의 단축번호 사전" (HashMap 활용)
        System.out.println("훈련 1: 나만의 단축번호 사전");
        HashMap<Integer, String> phoneBook = new HashMap<>(); // HashMap<(Key의 형태), (Value의 형태)> (배열명) = new HashMap<>();
        phoneBook.put(1, "엄마"); // ArrayList와 다르게 .put(key, value) 을 이용하여 추가.
        phoneBook.put(2, "아빠");
        phoneBook.put(3, "형");

        System.out.printf("%d번 단축번호: %s%n", 2, phoneBook.get(2)); // .get(key) == key번 value

        // 훈련 2: "위험한 배열" (예외 처리 try-catch)
        System.out.println("훈련 2: 위험한 배열 예외 처리");
        int[] arr = {10, 20, 30};
        try {
            System.out.printf("배열의 %d번 값: %d", 5, arr[4]); // 억지로 배열 밖의 값을 인덱싱.
            System.out.println("이게 나올 리가 없지");
        } catch (ArrayIndexOutOfBoundsException e) { // 저 긴 오류를 잡아내서 변수 e에 저장. 오류가 발생하면 이 부분을 출력.
            System.out.println("\uD83D\uDEA8 배열의 크기를 벗어났습니다!");
            System.out.printf("원인: %s%n", e.getMessage());
        }

        // 훈련 3: "동물원 상속" (클래스 상속과 오버라이딩)
        System.out.println("훈련 3: 동물원 상속");
        Cat c = new Cat();
        c.makeSound();
    }
}
