package Day31_Review6;

import java.util.ArrayList;

// 훈련 1: "어벤져스 어셈블!" (다형성과 컬렉션의 콜라보)
interface Hero { void useSkill(); } // 추상 메서드 선언.

class IronMan implements Hero {
    @Override
    public void useSkill() {
        System.out.println("빔 발사!");
    }
}

class SpiderMan implements Hero {
    @Override
    public void useSkill() {
        System.out.println("거미줄 쏘기!");
    }
}

// 훈련 2: "나만의 철벽 방어" (사용자 정의 예외 - Custom Exception)
class AgeException extends Exception {}
// 아무것도 필요 없음. 아무것도 안 적어도 부모(Exception)의 모든 기능을 물려받아서 정상 작동.
// 실무에서는 에러가 발생할 때 구체적인 메시지를 담기 위해 생성자를 하나 추가해 부모에게 전달(super)하는 방식을 많이 사용.
// public AgeException(String message) { super(message); }

public class Day31_Review6 {
    public static void main(String[] args) {
        // 훈련 1: "어벤져스 어셈블!" (다형성과 컬렉션의 콜라보)
        ArrayList<Hero> avengers = new ArrayList<>(); // Hero를 담을 수 있는 ArrayList 생성.

        avengers.add(new IronMan());
        avengers.add(new SpiderMan());

        for (Hero avenger : avengers) { // 향상된 for문을 돌면서 모든 영웅들이 스킬을 사용.
            avenger.useSkill();
        }

        // 훈련 2: "나만의 철벽 방어" (사용자 정의 예외 - Custom Exception)
        int age = -5;
        try {
            if (age < 0) { // 나이가 0보다 작으면
                throw new AgeException(); // AgeException 예외 처리
            }
        } catch (AgeException e) { // AgeException 오류를 잡아내서
            System.out.println("\uD83D\uDEA8 나이는 음수가 될 수 없습니다!"); // 해당 문장 출력
        }
    }
}
