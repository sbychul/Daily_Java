package Day24_Midterm;

public class Knight extends Hero {
    public Knight(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        System.out.printf("⚔\uFE0F [%s]이(가) 검을 크게 휘두릅니다!%n", name);
    }

    @Override
    public void usePotion() {
        hp += 50;
        System.out.printf("\uD83C\uDF77 [%s]이(가) 포션을 마셨습니다. (+50)%n", name);
    }
}
