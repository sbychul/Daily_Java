package Day45;

public class Account {
    private String accountNumber;
    private String ownerName;
    private long balance;

    public Account(String accountNumber, String ownerName, long balance) { // 생성자
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(long amount) { // 입금
        balance += amount;
    }

    public boolean withdraw(long amount) { // 출금
        if (balance < amount) { return false; } // 돈이 없는데 뺄 순 없잖아요
        balance -= amount;
        return true;
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
