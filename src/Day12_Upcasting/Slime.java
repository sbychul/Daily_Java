package Day12_Upcasting;

public class Slime extends Monster {
    public Slime(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        System.out.printf("[%s]이(가) 끈적한 점액을 발사합니다!%n", name);
    }
}
