package Day10_Inheritance;

public class Animal {
    protected String name;

    public Animal(String name) { // 생성자
        this.name = name;
    }
    // 부모에게 **"매개변수 없는 기본 생성자"**가 있으면 -> 자식은 생성자 안 만들어도 됩니다. (자동 해결)
    // 부모에게 "매개변수 있는 생성자만" 있으면 -> 자식은 무조건 생성자를 만들어서 super(값)을 호출해야 합니다. (강제 의무)

    public void cry() {
        System.out.printf("[%s]이(가) 소리를 냅니다.%n", name);
    }
}
