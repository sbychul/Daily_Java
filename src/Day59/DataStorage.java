package Day59;

import java.util.ArrayList;

// 실행, 디버깅 미진행본
public class DataStorage<T> {
    private ArrayList<T> list;

    public DataStorage(ArrayList<T> list) {
        this.list = list;
    }

    // 감점 포인트, 매개변수 없는 기본 생성자에서 리스트의 초기화를 요구받았음.
    public DataStorage() {
        this.list = new ArrayList<T>();
    }

    // 아이템 추가 메소드
    public void addData(T item) {
        list.add(item);
    }

    // 리스트 반환 메소드
    public ArrayList<T> getList() {
        return list;
    }
}
