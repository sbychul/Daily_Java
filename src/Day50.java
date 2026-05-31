import java.util.*;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> membersMap = new HashMap<>();

        membersSystem: while (true) {
            System.out.print("\n[원하는 기능을 선택하세요]\n1. 포인트 적립 / 갱신 || 2. 회원 조회 || 3. 전체 목록 조회 || 0. 종료\n선택: ");

            try { // 입력 예외 처리
                int choice = sc.nextInt();
                sc.nextLine(); // 버퍼 처리
                switch (choice) {
                    case 1 -> { // 적립 / 갱신
                        System.out.print("회원명을 입력하세요: ");
                        String memberName = sc.nextLine();
                        System.out.print("적립할 포인트의 양을 입력하세요: ");
                        int point = sc.nextInt();
                        // 없으면 0에다 더해서 put, 있다면 이미 있는 값에 point를 더해서 put.
                        membersMap.put(memberName, membersMap.getOrDefault(memberName, 0) + point);
                        // 알림 문구 출력
                        System.out.printf("[%s]님, [%d]포인트 적립이 완료되었습니다.%n", memberName, point);
                    }
                    case 2 -> { // 조회
                        System.out.print("조회하고자 하는 회원명을 입력하세요: ");
                        String findingName = sc.nextLine();
                        if (membersMap.containsKey(findingName)) { // 있으면 출력
                            System.out.printf("회원명: [%s] | 잔여 포인트: [%d]%n", findingName, membersMap.get(findingName));
                        } else System.out.println("존재하지 않는 회원입니다."); // 없으면 없다 안내
                    }
                    case 3 -> { // 전체 목록 출력
                        System.out.println("[전체 회원 목록]");
                        for (String memberName : membersMap.keySet()) { // key만을 Set으로 변환, set의 값을 순회하며 해당 key를 통하여 map에 접근, 출력.
                            System.out.println(String.format("회원명: [%s] | 잔여 포인트: [%d]", memberName, membersMap.get(memberName)));
                        }
                    }
                    case 0 -> { // 종료
                        System.out.println("프로그램을 종료합니다.");
                        break membersSystem;
                    }
                    default -> System.out.println("잘못된 번호입니다. 처음으로 되돌아갑니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 처음으로 되돌아갑니다.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
