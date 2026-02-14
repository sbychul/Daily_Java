package Day11_Override;

public class Monster {
    protected String name;
    protected int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack() {
        System.out.printf("[%s]이(가) 기본 공격을 합니다.%n", name);
    }
}
