package Day21_Object;

public class Day21_Main {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("홍길동", 20); // 이름과 나이가 완전 똑같은 복제인간

        // 1. toString() 테스트
        // 만약 오버라이딩 안 했다면 Day21_Object.Person@1b6d3586 가 나옴
        System.out.println(p1);

        // 2. equals() 테스트
        System.out.println("p1 == p2 결과: " + (p1 == p2)); // false (메모리 집 주소가 다름)
        System.out.println("p1.equals(p2) 결과: " + p1.equals(p2)); // true (내용물이 같음!)
    }
}