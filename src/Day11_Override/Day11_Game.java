package Day11_Override;

public class Day11_Game {
    public static void main(String[] args) {
        Slime greenday = new Slime("초록이", 50);
        Dragon toothless = new Dragon("투슬리스", 100);

        greenday.attack();
        toothless.attack();
    }
}
