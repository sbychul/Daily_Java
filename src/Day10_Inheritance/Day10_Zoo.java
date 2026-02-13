package Day10_Inheritance;

public class Day10_Zoo {
    public static void main(String[] args) {
        Dog bark = new Dog("바둑이");
        Cat meow = new Cat("나비");

        bark.cry(); // 울어라.
        meow.cry();

        bark.wagTail(); // 꼬리를 흔들어라.
        meow.grooming(); // 털을 갈아라.
    }
}
