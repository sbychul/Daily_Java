import java.util.Scanner;

public class Day5_Mission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = (int)(Math.random() * 100) + 1;
        int number = 0;
        int tries = 0;

        System.out.println("[숫자 맞추기 게임]");
        while (true) {
            System.out.print("1부터 100까지의 수를 입력하세요: ");
            number = sc.nextInt();
            if (number < 1 || number > 100) { // 예외 처리
                System.out.println("올바르지 않은 수 입력입니다.");
            } else {
                tries++;
                if (number < target) {
                    System.out.println("Up!");
                } else if (number > target) {
                    System.out.println("Down!");
                } else { // 작거나 크지 않으면 정답이니까
                    System.out.printf("정답입니다! (%d번 만에 맞춤)", tries);
                    break;
                }
            }
        }
        sc.close();
    }
}
