package Day33_Review8;

import java.util.ArrayList; // Item을 담을 수 있는 장바구니 리스트를 만들기 위한 ArrayList 호출

public class ShoppingCart {
    private ArrayList<Item> cartList = new ArrayList<>();

    public void addItem(Item item) { // cartList에 Item을 추가하는 메서드
        cartList.add(item);
        System.out.printf("[%s]이(가) 장바구니에 담겼습니다.%n", item.getName());
    }

    public void printReceipt() {
        int totalPrice = 0; // 합산 가격을 계산하기 위한 변수

        for (Item myItems : cartList) {
            myItems.showInfo(); // 장바구니 안의 모든 상품의 .showInfo()를 실행
            totalPrice += myItems.getPrice(); // 모든 상품의 가격을 합산
        }

        System.out.printf("\uD83D\uDCB0 총 결제 금액: [%d]원%n", totalPrice); // 요구한 양식대로 출력.
    }
}
