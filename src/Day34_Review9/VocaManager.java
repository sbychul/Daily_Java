package Day34_Review9;

import java.io.*;

public class VocaManager {
    private String fileName = "myVoca.txt";

    public void saveWord(String eng, String kor) {
        try (FileWriter writer = new FileWriter(fileName, true)) { // try-with-resources 문을 통해 writer가 자동으로 닫힘.
            writer.write("[" + eng + "] : [" + kor + "]\n");
            System.out.printf("\uD83D\uDCDD [%s] 단어가 파일에 저장되었습니다.%n", eng);
        } catch (IOException e) {
            System.out.println("🚨 저장 중 오류 발생!");
        }
    }

    public void showAllWords() {
        String vocaText; // 한 줄씩 저장할 변수.
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // BufferedReader 소환.
            System.out.println("--- 내 단어장 목록 ---");
            while ((vocaText = br.readLine()) != null) { // br이 한 줄씩 계속 읽는데, 그게 파일 끝까지 갈 때까지 반복
                System.out.println(vocaText); // 계속 출력.
            }
        } catch (IOException e) {
            System.out.println("🚨 파일을 읽는 중 오류 발생!");
        }
    }
}
