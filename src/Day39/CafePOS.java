package Day39;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CafePOS {
    private ArrayList<String> orderList = new ArrayList<>();
    private int totalPrice = 0;

    public void addmenu(String name, int price) { // 주문 받기
        orderList.add(name);
        totalPrice += price;
        System.out.printf("[%s]이(가) 주문 목록에 담겼습니다. (현재 총액: %d원)%n", name, totalPrice);
    }

    public void payAndPrintReceipt() {
        if (orderList.isEmpty()) {
            System.out.println("🚨 주문 내역이 없습니다.");
        } else {
            try (FileWriter fileWriter = new FileWriter("receipt.txt", true)) {
                fileWriter.write("=== 영수증 ===\n결제 일시: " + LocalDateTime.now() + "\n주문 내역: ");
                for (String orderedMenu : orderList) { // for문을 통해 작성
                    fileWriter.write(orderedMenu + ", ");
                }
                fileWriter.write("\n총 결제 금액: " + totalPrice + "원\n-----------------\n");
                System.out.println("🖨️ 결제가 완료되었습니다. (receipt.txt 파일에 영수증 저장 완료)");
                orderList.clear(); // 주문 목록 초기화
                totalPrice = 0; // 금액 초기화
            } catch (IOException e) {
                System.out.println("🚨 영수증 출력 중 오류 발생!");
                System.out.printf("원인: %s%n", e.getMessage());
            }
        }
    }
}
