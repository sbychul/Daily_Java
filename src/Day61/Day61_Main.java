package Day61;

import java.util.*;
import java.io.*;

// 메모장으로 작성. 실행, 디버깅 미진행
public class Day61_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple = sc.nextInt();

        try (FileWriter fw = new FileWriter("result.txt")) {
            for (int i = 1; i <= 100; i++) {
                if ((i % multiple) == 0) fw.write(i + "\n");
            }
        } catch (IOException e) { System.out.println("파일 입출력 오류 발생"); }
    }
}