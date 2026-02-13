package Day10_Inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void wagTail() {
        System.out.printf("[%s]이(가) 꼬리를 살랑살랑 흔듭니다.%n", name);
    }
}
