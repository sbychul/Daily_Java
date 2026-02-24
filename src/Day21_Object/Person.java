package Day21_Object;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1. toString() 오버라이딩: 객체를 출력하면 이 문자열이 나옵니다!
    @Override
    public String toString() {
        return "[이름: " + name + ", 나이: " + age + "]";
    }

    // 2. equals() 오버라이딩: 이름과 나이가 같으면 "같은 사람"으로 인정!
    @Override
    public boolean equals(Object obj) {
        // 들어온 obj가 Person 타입인지 확인 (13일 차 Downcasting 기억나시죠?)
        if (obj instanceof Person p) {
            // 내 이름/나이와 들어온 사람(p)의 이름/나이가 같으면 true!
            if (this.name.equals(p.name) && this.age == p.age) {
                return true;
            }
        }
        return false;
    }
}