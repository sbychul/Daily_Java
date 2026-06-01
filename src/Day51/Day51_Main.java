package Day51;

public class Day51_Main { // 달리기 주관만 하고 끝.
    public static void main(String[] args) {
        RacerThread racer1 = new RacerThread("Max Verstappen");
        RacerThread racer2 = new RacerThread("Lewis Hamilton");
        RacerThread racer3 = new RacerThread("Lando Norris");

        racer1.start();
        racer2.start();
        racer3.start();
    }
}
