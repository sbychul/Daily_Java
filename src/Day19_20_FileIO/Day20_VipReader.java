package Day19_20_FileIO;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Day20_VipReader {
    public static void main(String[] args) {
        System.out.println("[VIP 고객 명단 불러오기]");

        try (BufferedReader br = new BufferedReader(new FileReader("vip.txt"))) { // 파일에 빨대 꽂고, 펌프 장착
            String text; // 파일 내용을 불러오고 출력하기 위한 변수

            while ((text = br.readLine()) != null) {
                // text에 vip.txt의 한 줄씩 집어넣음. 한 줄씩 넣으며, 더 넣을 줄이 없을 때까지 반복해라.
                System.out.printf("VIP 고객명: %s%n", text); // 출력
            }

            System.out.println("명단 불러오기가 완료되었습니다.");
        }   // try문이 종료되며 자동으로 BufferedReader와 FileReader가 close됨. 따로 적어줄 필요가 없음.

        catch (IOException e) { // 예외 처리
            System.out.println("파일을 불러오는 데 실패하였습니다.");
            System.out.printf("원인: %s", e.getMessage());
        }
    }
}
