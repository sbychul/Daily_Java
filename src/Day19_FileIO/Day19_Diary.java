package Day19_FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day19_Diary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("[한 줄 일기장]%n오늘의 일기를 작성하세요: ");
        try {
            FileWriter writer = new FileWriter("diary.txt", true); // append: true == 지난 내용에 이어서 작성한다
            writer.write(sc.nextLine());
            writer.write("\n"); // 줄바꿈

            writer.close();
            sc.close();

            System.out.println("일기가 성공적으로 저장되었습니다.");
        }
        catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다.");
            System.out.printf("원인: %s", e.getMessage());
        }
    }
}

// 🚀 시니어 개발자의 꿀팁: 알아서 문 닫아주는 자동문 (try-with-resources)
// 님이 작성하신 코드에서 writer.close()는 아주 중요합니다. 그런데 만약 writer.write()를 하던 중에 갑자기 에러가 터져서 코드가 catch 블록으로 넘어가 버리면 어떻게 될까요?
// -> .close()를 만나지 못하고 프로그램이 끝나버려서 파일이 열린 채로 방치됩니다. (메모리 누수 발생!)
// 그래서 자바 7부터는 "괄호 안에 자원(빨대)을 선언하면, 볼일 다 보고 알아서 문을 닫아주는 마법의 문법"이 생겼습니다. (실무에서는 99% 이 방식을 씁니다.)

// try 괄호 ( ) 안에 빨대를 꽂습니다.
// try (FileWriter writer = new FileWriter("diary.txt", true)) {
//     writer.write(sc.nextLine());
//     writer.write("\n");
//     System.out.println("일기가 성공적으로 저장되었습니다.");
// } <--- 이 중괄호가 끝나는 순간, 자바가 알아서 writer.close()를 실행해 줍니다! (에러가 나도 닫아줌)
// catch (IOException e) {
//     // ...
// }