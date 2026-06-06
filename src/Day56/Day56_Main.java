package Day56;

import java.io.*;
import java.util.ArrayList;

public class Day56_Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("scores.txt"))) {
            ArrayList<Driver> driverStandings = new ArrayList<>();
            String line;

            // 파일을 끝까지 읽을 때까지 반복
            while ((line = br.readLine()) != null) {
                // 파일의 구분자 ":"로 배열 생성
                String driverInfo[] = line.split(":");
                // 슬라이싱하여 새 드라이버 객체를 ArrayList에 추가
                driverStandings.add(new Driver(driverInfo[0], Integer.parseInt(driverInfo[1])));
            }
            // 출력부, 300포인트 이상인 인원만 출력.
            System.out.println("[2025 F1 DRIVER STANDINGS (300포인트 이상)]");
            driverStandings.forEach(driver -> {
                if (driver.getPoint() >= 300) System.out.printf("[%s] - %d포인트%n",driver.getName(), driver.getPoint()); });
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }
}
