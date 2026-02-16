package Day13_Downcasting;

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void cry() {
        System.out.printf("[%s]이(가) 소리를 냅니다.%n", name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void grooming() {
        System.out.printf("[%s]이(가) 털을 핥습니다.%n", name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void wagTail() {
        System.out.printf("[%s]이(가) 꼬리를 살랑살랑 흔듭니다.%n", name);
    }
}

public class Day13_ZooClinic {
    public static void main(String[] args) {
        Animal zoo[] = new Animal[3];

        zoo[0] = new Dog("갱얼쥐");
        zoo[1] = new Cat("공양이");
        zoo[2] = new Dog("강아르지");

        for (Animal animal : zoo) {
            if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.wagTail();
            }
            else if (animal instanceof Cat) {
                Cat c = (Cat) animal;
                c.grooming();
            }
            else {
                System.out.println("으악 이게 뭐야");
            }
        }
    }
}

// Java 16 버전 이상부터는 이걸 한 방에 줄여주는 "패턴 매칭" 기능이 생겼습니다. (알아두면 "오, 최신 문법 좀 아는데?" 소리 듣습니다.)
// 변수 선언(d)을 if문 안에서 바로 해버립니다!
// if (animal instanceof Dog d) {
//         d.wagTail(); // 별도로 캐스팅 할 필요 없음 (자동 변환됨)
// }