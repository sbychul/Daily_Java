package Day12_Upcasting;

public class Day12_Shop {
    public static void main(String[] args) {
        Product[] shoppingCart = new Product[3];
        int totalPrice = 0;

        shoppingCart[0] = new Computer();
        shoppingCart[1] = new Tv();
        shoppingCart[2] = new Computer();

        for (Product p : shoppingCart) {
            // 코드 상의 타입: p는 Product입니다.
            // 실제 메모리: Computer도 들어있고, Tv도 들어있습니다.
            // 결과: 하나의 반복문으로 서로 다른 물건들을 일사불란하게 처리했죠. 이게 바로 객체 지향의 맛입니다.
            System.out.printf("[%s] 담기%n", p.getName());
            totalPrice += p.getPrice();
        }
        System.out.println("---------------");
        System.out.printf("총 구매 금액: [%d]원", totalPrice);
    }
}
