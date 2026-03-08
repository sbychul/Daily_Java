package Day32_Review7;

public class Day32_Main {
    public static void main(String[] args) {
        Bank sbcBank = new Bank();
        Account dongsAcc = new Account("111-222", "홍길동", 50000);
        Account susAcc = new Account("333-444", "김철수", 10000);

        sbcBank.openAccount(dongsAcc);
        sbcBank.openAccount(susAcc);

        dongsAcc.deposit(20000);

        try {
            susAcc.withdraw(50000);
        } catch (Exception e) {
            System.out.printf("%s%n", e.getMessage());
        }

        dongsAcc.showInfo();
        susAcc.showInfo();
    }
}
