package Day7_8_Class;

public class Character {
    String name;
    String job;
    int hp;

    // 1. 생성자 (Constructor)
    // 리턴 타입(void, int)이 아예 없습니다! 클래스 이름과 똑같아야 합니다.
    public Character(String name, String job, int hp) {
        // Python: self.name = name
        this.name = name;
        this.job = job;
        this.hp = hp;
        System.out.println("✨ " + this.name + " 캐릭터가 생성되었습니다!");
    }

    void introduce() {
        System.out.printf("저는 %s [%s]이고, 체력은 %dHP입니다.%n", job, name, hp);
    }

    void attack() {
        System.out.printf("[%s]이(가) 공격합니다!%n", name);
    }
}
