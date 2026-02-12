package Day9_Encapsulation;

public class Person {
    private String name;
    private int age;
    // 변수는 숨김(private)

    public Person(String name) {
        this.name = name;
    }
    // 메서드는 개방(public)

    void setAge(int age) {
        if (age < 1 || age > 150) {
            System.out.println("나이가 올바르지 않습니다.");
            return;
        }
        else {
            this.age = age;
        }
    }

    int getAge() {
        return age;
    }

    void introduce() {
        System.out.printf("내 이름은 [%s]이고, 나이는 [%d]세입니다.", name, age);
    }

    // 메서드 앞에 접근 제어자 (private, public)을 안 붙이면 같은 패키지(폴더) 안에 있는 친구들끼리만 쓰라는 뜻이 됨.
    // (== default 접근 제어자)
    // 다른 패키지에서도 사용하게 하려면 public을 붙여주면 됨.
    // => public void setAge(int age), public int getAge(), public void introduce()
}
