package Day33_ReviewExtra;

public class Main {
    public static void main(String[] args) {
        CafeQueue ingCafe = new CafeQueue(); // 학교 카페 이름임..
        ingCafe.addCustomer("아인슈타인");
        ingCafe.addCustomer("뉴턴");
        ingCafe.addCustomer("갈릴레이");

        ingCafe.callNext();
        ingCafe.callNext();
        System.out.println(ingCafe.showWaitCount());
    }
}
