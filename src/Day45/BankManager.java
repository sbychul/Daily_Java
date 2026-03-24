package Day45;

import java.util.HashMap;

public class BankManager {
    private HashMap<String, Account> bankDB = new HashMap<>();
    // 계좌번호가 Key, Account 객체가 Value가 될 예정.

    // 계좌 개설. 처음 만들면 0원일테니까 금액은 받을 필요 없다는 생각.
    public void createAccount(String accNum, String ownerName) {
        if (bankDB.containsKey(accNum)) { // 계좌 번호가 중복될 때.
            System.out.println("계좌번호가 중복됩니다. 해당 번호로는 생성할 수 없습니다.");
            return;
        }
        bankDB.put(accNum, new Account(accNum, ownerName, 0));
        System.out.printf("신규 가입을 환영합니다, %s님!%n", ownerName);
    }

    // 입금
    public void depositToAccount(String accNum, long amount) {
        if (!bankDB.containsKey(accNum)) { // 계좌가 없다면
            System.out.println("해당 계좌는 존재하지 않습니다.");
            return;
        }
        // 있다면 돈을 넣자
        bankDB.get(accNum).deposit(amount);
        System.out.printf("\uD83D\uDCB0 [%d]원이 입금되었습니다. (현재 잔액: %d원)%n", amount, bankDB.get(accNum).getBalance());
    }

    // 출금
    public void withdrawFromAccount(String accNum, long amount) {
        if (!bankDB.containsKey(accNum)) { // 계좌가 없다면
            System.out.println("해당 계좌는 존재하지 않습니다.");
            return;
        }
        if (bankDB.get(accNum).withdraw(amount)) { // 돈이 충분하다면
            System.out.printf("\uD83D\uDCB8 [%d]원이 출금되었습니다.%n", amount);
            return;
        }
        // 여기까지 왔다면 돈이 없다는 것.
        System.out.println("\uD83D\uDEA8 잔액이 부족합니다.");
    }

    // 송금
    public void transfer(String fromAcc, String toAcc, long amount) {
        // 계좌가 둘 중 하나라도 없다면// 계좌가 둘 중 하나라도 없다면
        if (!bankDB.containsKey(fromAcc) || !bankDB.containsKey(toAcc)) {
            System.out.println("존재하지 않는 계좌가 입력되었습니다.");
            return;
        }

        // 같은 계좌라면 (¡무한동력 돈!이다)
        if (fromAcc.equals(toAcc)) {
            System.out.println("\uD83D\uDEA8 동일한 계좌로는 이체할 수 없습니다.");
            return;
        }

        // 계속 불러다 쓰기 귀찮아서 객체 만들어버리기
        Account from = bankDB.get(fromAcc);
        Account to = bankDB.get(toAcc);

        if (from.withdraw(amount)) { // if문을 통과했다면 보낼 돈이 있다는 것!!
            to.deposit(amount);
            System.out.printf("\uD83D\uDD04 [%s]님이 [%s]님에게 [%d]원을 이체했습니다.%n", from.getOwnerName(), to.getOwnerName(), amount);
            return;
        }

        // 돈이 없는 것!!!!!!!!!
        System.out.println("\uD83D\uDEA8 잔액이 부족합니다.");
    }
}
