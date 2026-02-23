package Day19_20_FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day20_Main {
    public static void main(String[] args) {
        System.out.println("=== 파일 읽기 시작 ===\n");

        // 1. 빨대(FileReader) 꽂고, 펌프(BufferedReader) 장착하기
        try (BufferedReader br = new BufferedReader(new FileReader("diary.txt"))) {
            String text;    // 글을 불러오기 위한 변수
            int count = 1;  // 줄 번호를 세기 위한 변수

            // 2. 파일의 끝(null)에 도달할 때까지 한 줄씩 계속 읽어오기
            while ((text = br.readLine()) != null) {
                System.out.printf("%d일 차 일기: %s%n", count++, text);
            }

            System.out.println("\n=== 파일 읽기 완료 ===");

        } catch (IOException e) {
            System.out.println("🚨 파일을 찾는 데 실패했습니다.");
            System.out.println("원인: " + e.getMessage());
        }
    }
}