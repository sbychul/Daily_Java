package Day33_Review8;

public class Electronics extends Item {
    private int warranty; // 추가 필드 보증 기간

    public Electronics(String name, int price, int warranty) {
        super(name, price);
        this.warranty = warranty; // 이름과 가격을 받는 부분은 유지하되, 보증 기간을 입력하는 부분을 추가.
    }

    @Override
    public void showInfo() {
        System.out.printf("[가전] [%s] (보증: [%d]개월) - [%d]원%n", getName(), warranty, getPrice());
        // Book과 동일하게 이름과 가격은 private이기 때문에 Getter 메서드를 사용하여 가져와야 함.
    }
}
