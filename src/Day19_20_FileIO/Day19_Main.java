package Day19_20_FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class Day19_Main {
    public static void main(String[] args) {
        // 파일 입출력은 무조건 try-catch 방 안에 가둬야 합니다!
        try {
            // 1. 빨대 꽂기 (파일이 없으면 알아서 만들어줍니다!)
            // true를 붙이면 실행할 때마다 내용이 누적됩니다.
            FileWriter writer = new FileWriter("memo.txt", true); // 문을 연다

            // 2. 파일에 글씨 쓰기 (\n은 줄바꿈)
            writer.write("안녕하세요! 자바에서 쓴 첫 번째 줄입니다.\n");
            writer.write("파일 입출력, 생각보다 안 어렵네요!\n"); // 볼일을 본다

            // 3. ★가장 중요★ 빨대 뽑기 (저장 및 닫기)
            writer.close(); // 문을 닫는다.

            System.out.println("파일 저장이 완료되었습니다! 좌측 폴더를 확인해 보세요.");
        }
        catch (IOException e) { // Exception 이름이 IOException(Input/Output)으로 바뀜!
            System.out.println("🚨 파일 저장 중 에러가 발생했습니다.");
            System.out.println("원인: " + e.getMessage());
        }
    }
}
