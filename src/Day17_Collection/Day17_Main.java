package Day17_Collection;

import java.util.ArrayList; // 필수!

public class Day17_Main {
    public static void main(String[] args) {
        // 1. 문자열을 담는 ArrayList 생성
        // 뒤쪽 꺾쇠 <> 안에는 타입을 생략해도 됩니다.
        ArrayList<String> cart = new ArrayList<>();

        // 2. 데이터 추가 (크기가 알아서 늘어남)
        cart.add("노트북");
        cart.add("마우스");
        cart.add("키보드");

        System.out.println("현재 담긴 물건 수: " + cart.size()); // 출력: 3

        // 3. 특정 위치의 데이터 가져오기
        System.out.println("첫 번째 물건: " + cart.get(0)); // 출력: 노트북

        // 4. 데이터 삭제
        cart.remove(1); // 1번 인덱스(마우스) 삭제

        // 마우스가 지워지면 키보드가 자동으로 1번 자리로 당겨집니다!
        System.out.println("삭제 후 1번 물건: " + cart.get(1)); // 출력: 키보드
    }
}