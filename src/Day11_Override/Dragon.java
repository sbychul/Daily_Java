package Day11_Override;

public class Dragon extends Monster {
    public Dragon(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        System.out.printf("[%s]이(가) 화염을 뿜습니다! \uD83D\uDD25%n", name);
    }
}
