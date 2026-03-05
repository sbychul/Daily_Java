package Day29_Review4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 훈련 1: "자격증을 땁시다" (인터페이스 구현 - implements)
interface Playable {
    void play();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("🎵 음악을 재생합니다!");
    }
}

public class Day29_Review4 {
    public static void main(String[] args) {
        // 훈련 1: "자격증을 땁시다" (인터페이스 구현 - implements) 출력부
        MusicPlayer appleMusic = new MusicPlayer();
        appleMusic.play();

        // 훈련 2: "비밀 일기장 훔쳐보기" (파일 읽기 - BufferedReader)
        try (BufferedReader br = new BufferedReader(new FileReader("secret.txt"))) { // FileReader에 BufferedReader 장착.
            String line;
            line = br.readLine();
            System.out.printf("%s", line);
        } catch (IOException e) {
            System.out.printf("오류가 발생했습니다. 원인: %s", e.getMessage());
        }

        // 훈련 3: "거짓말쟁이 문자열" (String 형변환 - Integer.parseInt)
        String priceStr = "15000";
        int price = Integer.parseInt(priceStr);

        System.out.printf("%n%d", price + 5000);
    }
}
