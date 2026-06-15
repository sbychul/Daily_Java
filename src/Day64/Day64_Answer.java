package Day64;

import java.util.function.*; // Predicate용
import java.util.*;          // Scanner용 (이번 예제에선 미사용했으나 유지)
import java.io.*;           // 🌟 필수: FileWriter, IOException용 임포트 추가

// 제미나이의 모범 답안.
public class Day64_Answer {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0; // 🌟 스펠링 교정 (Predicate)

        try (FileWriter fw = new FileWriter("final_result.txt", true)) {
            for (int i = 1; i <= 50; i++) {
                if (isEven.test(i)) fw.write(i + "\n");
            }
        } catch (IOException e) {
            System.out.println("오류가 발생하였습니다");
        }

        // 🌟 핵심: 메인 스레드를 멈추는 게 아니라, 독립 스레드를 만들어서 .start()로 비동기 실행!
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
                System.out.println("[ALARM] 파일 저장 작업이 안전하게 완료되었습니다.");
            }
        }.start();
    }
}