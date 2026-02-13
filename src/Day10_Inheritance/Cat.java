package Day10_Inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void grooming() {
        System.out.printf("[%s]이(가) 털을 핥습니다.%n", name);
    }
}
