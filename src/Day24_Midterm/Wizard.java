package Day24_Midterm;

public class Wizard extends Hero {
    public Wizard(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        System.out.printf("\uD83D\uDD25 [%s]이(가) 파이어볼을 날립니다!%n", name);
    }

    @Override
    public void usePotion() {
        hp += 30;
        System.out.printf("\uD83C\uDF77 [%s]이(가) 마나 포션을 마셨습니다. (+30)%n", name);
    }
}
