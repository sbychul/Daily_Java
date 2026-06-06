package Day56;

// 생성자와 Getter 메서드만 가진 단순한 클래스
public class Driver {
    String name;
    int point;

    public Driver(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
