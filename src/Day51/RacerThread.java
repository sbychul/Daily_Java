package Day51;

public class RacerThread extends Thread {
    String name;

    public RacerThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { // 5바퀴까지 반복
            System.out.println(String.format("[%s]이(가) [%d]/5 바퀴를 통과했습니다!", name, i));
            if (i == 5) {
                System.out.println(String.format("[%s] 완주!", name)); // 완주 시(5바퀴 도달 시) 출력
                return;
            }

            try { // 0~1초 사이 무작위 대기 시간
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
    }
}
