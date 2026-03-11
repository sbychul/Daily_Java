package Day35_Review10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 새 스캐너 객체 생성.
        Library haksan = new Library(); // 학교 도서관 이름 넣어버리기.

        libraryProgram: while (true) { // 무한 영역 전개
            System.out.println("--- 도서관 메뉴 ---");
            System.out.println("1. 도서 등록 | 2. 전체 조회 | 3. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.printf("도서를 등록합니다.%n도서 제목: ");
                    sc.nextLine(); // 엔터키 씹히는 현상 방지
                    String title = sc.nextLine();
                    System.out.printf("도서 저자: ");
                    String author = sc.nextLine();
                    haksan.addBook(title, author);
                }
                case 2 -> haksan.showAllBooks();
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    break libraryProgram; // 루프에 라벨링. 무한루프 탈출.
                }
                default -> System.out.println("올바른 번호를 다시 입력해 주세요.");
            }
        }
        sc.close();
    }
}
