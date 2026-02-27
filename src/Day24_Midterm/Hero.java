package Day24_Midterm;

public abstract class Hero implements Healable {
    protected String name;
    protected int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void attack();

    public void showInfo() {
        System.out.printf("[%s]님의 현재 체력: [%d]%n", name, hp);
    }
}
