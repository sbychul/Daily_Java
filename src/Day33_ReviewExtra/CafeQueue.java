package Day33_ReviewExtra;

import java.util.ArrayList;

public class CafeQueue {
    private ArrayList<String> waitingList = new ArrayList<>();

    public void addCustomer(String name) {
        waitingList.add(name);
        System.out.printf("[%s]님, 대기 명단에 추가되었습니다.%n", name);
    }

    public void callNext() {
        if (waitingList.isEmpty() == true) {
            System.out.println("🚨 대기 인원이 없습니다.");
        }
        else {
            String calledCustomer = waitingList.remove(0);
            System.out.printf("[%s]님, 주문하신 커피 나왔습니다!%n", calledCustomer);
        }
    }

    public String showWaitCount() {
        return "현재 대기 인원: " + waitingList.size() + "명";
    }
}
