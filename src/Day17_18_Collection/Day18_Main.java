package Day17_18_Collection;

import java.util.HashMap; // 필수!

public class Day18_Main {
    public static void main(String[] args) {
        // 1. HashMap 생성: <영어단어(Key), 한국어뜻(Value)>, 파이썬의 Dictionary와 똑같음.
        HashMap<String, String> dic = new HashMap<>();

        // 2. 데이터 추가 (순서는 중요하지 않음!)
        dic.put("apple", "사과");
        dic.put("banana", "바나나");
        dic.put("cat", "고양이");

        System.out.println("사전에 등록된 단어 수: " + dic.size()); // 출력: 3

        // 3. 데이터 조회 (인덱스가 아니라 이름표(Key)로 찾는다!)
        System.out.println("apple의 뜻: " + dic.get("apple")); // 출력: 사과

        // 4. 데이터 수정 (같은 Key에 다시 put을 하면 덮어쓰기 됨)
        dic.put("apple", "맛있는 사과");
        System.out.println("수정된 apple의 뜻: " + dic.get("apple")); // 출력: 맛있는 사과

        // 5. 전체 데이터 출력 (Key 꾸러미를 가져와서 반복문 돌리기)
        System.out.println("\n=== 사전 전체 보기 ===");
        for (String key : dic.keySet()) {
            System.out.printf("%s : %s%n", key, dic.get(key));
        }
    }
}
