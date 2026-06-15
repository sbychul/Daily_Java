package Day64;

import java.util.function.*;
import java.util.*;
import java.io.*;

// 메모장 작성. 실행, 디버깅 미진행
public class Day64_Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0;

        try (FileWriter fw = new FileWriter("final_result.txt", true)) {
            for (int i = 1; i <= 50; i++) { if(isEven.test(i)) fw.write(i + "\n"); }
        } catch (IOException e) { System.out.println("오류가 발생하였습니다"); }

        try { Thread.sleep(500); } // 0.5초 쉬고
        catch (InterruptedException e) {}

        System.out.println("[알림] 파일 저장 작업이 안전하게 완료되었습니다.");
    }
}