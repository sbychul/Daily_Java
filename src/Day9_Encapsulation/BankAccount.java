package Day9_Encapsulation;

public class BankAccount {
    // 1. 핵심: 변수는 무조건 private! (외부에서 안 보임)
    private int balance;

    // 생성자
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // 2. Deposit (입금) - Setter 역할
    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("❌ 에러: 마이너스 금액은 입금할 수 없습니다.");
            return; // 메서드 종료
        }
        this.balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
    }

    // 3. GetBalance (잔액 조회) - Getter 역할
    // 외부에서 balance를 직접 못 보니까, 이 메서드를 통해 값만 살짝 보여줌
    public int getBalance() {
        return this.balance;
    }
}