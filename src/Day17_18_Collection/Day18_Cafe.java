package Day17_18_Collection;

import java.util.HashMap;

public class Day18_Cafe {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();

        menu.put("아메리카노", 1800);
        menu.put("바닐라 라떼", 3300);
        menu.put("그린티 라떼", 3500);

        System.out.printf("바닐라 라떼의 가격은 %d원 입니다.%n", menu.get("바닐라 라떼"));
        System.out.println("=== 카페 메뉴판 ===");
        for (String drinks : menu.keySet()) { // .keySet 꾸러미를 가져와서 반복문을 돌림.
            System.out.printf("%s : %d원%n", drinks, menu.get(drinks)); // .get(drinks) == drinks 변수 값에 해당하는 데이터(가격)를 가져옴
        }
        // 출력 순서는 HashMap이 데이터를 넣은 순서를 기억하지 않기에, 뒤죽박죽으로 나와도 정상.
    }
}

// 🚀 시니어 개발자의 꿀팁: 한 번에 두 마리 토끼 잡기 (entrySet)
// 지금 작성하신 keySet() + get() 조합은 가장 근본적이고 훌륭한 방법입니다.
// 그런데 만약 메뉴가 100만 개라면? keySet()으로 이름표 100만 개를 가져온 다음, get()으로 사전을 100만 번 다시 뒤져야 합니다. 조금 비효율적일 수 있겠죠?
// 그래서 실무에서는 "이름표와 데이터를 한 세트(Entry)로 묶어서 한 번에 뽑아내는" 방법을 쓰기도 합니다. (알아만 두세요!)

// Map.Entry 라는 상자에 키와 값을 세트로 담아서 꺼냅니다.
// for (Map.Entry<String, Integer> entry : menu.entrySet()) {
//      String drinks = entry.getKey();   // 이름표 바로 겟!
//      int price = entry.getValue();     // 데이터 바로 겟! (사전 다시 뒤질 필요 없음)
//      System.out.printf("%s : %d원%n", drinks, price);
// }
// 나중에 데이터가 엄청나게 많아져서 프로그램이 느려질 때, 이 entrySet()을 떠올리시면 됩니다!