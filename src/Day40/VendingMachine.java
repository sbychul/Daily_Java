package Day40;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Drink> drinks = new ArrayList<>(); // 음료수 진열 리스트
    private int balance = 0; // 손님이 넣은 돈을 기억할 변수

    public VendingMachine() { // 자판기 초기 설정 (음료 배치)
        drinks.add(new Drink("콜라", 1200, 3));
        drinks.add(new Drink("사이다", 1000, 2));
        drinks.add(new Drink("물", 800, 0));
    }

    public int getBalance() {
        return balance;
    }

    public void insertMoney(int amount) { // 자판기에 돈 넣기
        balance += amount;
        System.out.printf("\uD83D\uDCB0 [%d]원을 투입했습니다. (현재 잔액: [%d]원)%n", amount, balance);
    }

    public void showDrinks() { // 모든 음료 정보 출력
        for (Drink drink : drinks) {
            System.out.println(drink); // for문을 돌며 drink.toString() 문구를 출력.
        }
    }

    // 오늘의 하이라이트: 음료 구매 메서드
    public void buyDrink(String drinkName) {
        for (Drink drink : drinks) { // for문을 돌며 해당하는 음료가 있는 지 찾음.
            if (drinkName.equals(drink.getName())) { // 해당하는 음료를 목록에서 발견했다면
                if (drink.getStock() <= 0) { // 해당 음료의 재고 확인
                    System.out.printf("\uD83D\uDEA8 [%s]은(는) 품절입니다.%n", drinkName);
                    return; // 더 이상 진행할 필요 없음. 메서드 종료
                } else { // 재고가 있음. 다음 단계로
                    if (balance < drink.getPrice()) { // 자판기에 넣은 금액이 해당 음료의 가격보다 모자라다면
                        System.out.printf("\uD83D\uDEA8 잔액이 부족합니다. (부족한 금액: [%d]원)%n", drink.getPrice() - balance);
                        return; // 돈이 없음. 메서드 종료.
                    } else { // 돈도 충분한 음료를 마실 자격이 있는 녀석
                        balance -= drink.getPrice(); // 음료 가격을 지불
                        drink.reduceStock(); // 재고가 하나 빠져나감
                        System.out.printf("\uD83E\uDD64 [%s]이(가) 나왔습니다! (남은 잔액: [%d]원)%n", drinkName, balance);
                        return; // 해당 음료를 팔았음, 메서드 종료.
                    }
                }
            }
        }
        // 위에서 입력받은 것과 이름이 일치하는 품목을 찾았다면 전부 메서드 종료 메커니즘을 넣어 두었음.
        // 따라서 for문이 끝까지 가서 종료됨 == 해당하는 음료가 존재하지 않음
        System.out.printf("\uD83D\uDEA8 [%s]은(는) 존재하지 않는 품목입니다.%n", drinkName);
    }
}
