package Day46;

import java.util.ArrayList;

// 45일차에서 약간의 수정이 더해짐.
public class Account46 {
    private String accountNumber;
    private String ownerName;
    private long balance;
    // 46일차 추가) 계좌 거래 내역을 담을 ArrayList 추가
    private ArrayList<String> history = new ArrayList<>();

    // 생성자, 거래 내역을 생성 시 써 줄 필요는 없으니 수정 X
    public Account46(String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(long amount) { // 입금
        balance += amount;
        // 46일차 추가) 거래 내역에 입금 내역(문자열)을 추가.
        history.add("[입금] ➕ " + amount + "원 (잔액: " + balance + "원)");
    }

    public boolean withdraw(long amount) { // 출금
        if (balance < amount) { return false; } // 돈이 없는데 뺄 순 없잖아요
        balance -= amount;
        // 46일차 추가) 거래 내역에 출금 내역(문자열)을 추가.
        history.add("[출금] ➖ " + amount + "원 (잔액: " + balance + "원)");
        return true;
    }

    // 46일차 추가) 거래 내역을 출력하는 메서드.
    public void printHistory() {
        if (history.isEmpty()) { // 거래 내역이 비어 있다면
            System.out.println("거래 내역이 없습니다.");
            return;
        }
        // 안 비어 있다면 (Guard clause)
        for (String log : history) {
            // 한 줄씩 출력
            System.out.println(log);
        }
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }
}
