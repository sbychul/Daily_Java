import java.util.*;

public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> lottoSet = new HashSet<>();
        System.out.print("로또 진행 횟수를 입력하세요: ");
        try {
            int trials = sc.nextInt(); // 진행 횟수 입력

            for (int i = 0; i < trials; i++) {
                lottoSet.clear(); // Set 초기화
                while (lottoSet.size() < 6) {
                    lottoSet.add((int) (Math.random() * 45 + 1)); // 1부터 45 사이의 임의 정수를 Set에 추가
            }

                ArrayList<Integer> lottoArray = new ArrayList<>(lottoSet); // Set은 순서 보장 x, 배열로 변환
                Collections.sort(lottoArray); // 해당 배열을 Collections.sort()를 이용하여 오름차순 정렬

                System.out.println("로또 번호: " + lottoArray);
            }
        } catch (InputMismatchException e) {
            System.out.println("진행 횟수의 입력이 올바르지 않습니다. 프로그램을 종료합니다.");
        } finally {
            sc.close();
        }
    }
}
