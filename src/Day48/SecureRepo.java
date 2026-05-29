package Day48;

import java.util.*;

public class SecureRepo<T> {
    private ArrayList<T> list = new ArrayList<>();

    // 아이템 보관, 최대 5개만 저장 가능
    public void store(T item) {
        if (list.size() == 5) { // 크기가 5에 도달할 시 저장하지 않음
            System.out.println("보관소가 가득 찼습니다.");
            return;
        }

        list.add(item);
    }

    // 인덱스 번호를 통하여 반환
    public T retrieve(int index) {
        if (index < 0 || index >= list.size()) { return null; } // 인덱스가 범위를 벗어나면 null 반환
        return list.get(index); // 아니라면 해당 요소 반환.
    }

    // 현재 저장된 모든 데이터를 순서대로 출력
    public void showAll() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
