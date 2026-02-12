import java.util.Scanner; // 1. 도구 상자에서 Scanner를 꺼냅니다.

public class Day2_Input {
    public static void main(String[] args) {
        // 2. 스캐너 기계 조립 (System.in은 키보드를 의미합니다)
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 자바 입력 테스트 ===");
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt(); // 정수 읽기

        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble(); // 실수 읽기

        System.out.print("이름을 입력하세요: ");
        String name = sc.next(); // 문자열 읽기 (띄어쓰기 전까지만 읽음!!)

        System.out.println(name + "님의 나이는 " + age + "세, 키는 " + height + "cm 입니다.");

        sc.close(); // 스캐너 종료. (C에서 파일 닫는 것과 비슷)
    }
}