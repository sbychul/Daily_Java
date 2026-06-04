package Day54;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Day54_Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("drivers.txt"))) {
            ArrayList<String> drivers = new ArrayList<>();
            String line;

            // 파일이 끝날 때까지 한 줄씩 읽어와 line 변수에 저장.
            while ((line = reader.readLine()) != null) {
                drivers.add(line); // 배열에 추가
            }

            // 메소드 참조를 이용한 전체 출력
            drivers.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다.");
        }
    }
}
