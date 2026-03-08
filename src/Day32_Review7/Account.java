package Day32_Review7;

public class Account {
    private String accNumber;
    private String owner;
    private int balance;

    public Account(String accNumber, String owner, int balance) {
        this.accNumber = accNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.printf("[%s]님, [%d]원 입금 완료.%n", owner, amount);
    }

    public void withdraw(int amount) throws Exception {
        if (amount > balance) {
            throw new Exception("\uD83D\uDEA8 출금 실패: 잔액이 부족합니다!"); // 예외 메시지를 던짐. e.getMessage()하면 해당 문구가 나옴.
        } else {
            balance -= amount;
            System.out.printf("[%s]님, [%d]원 출금 완료.%n", owner, amount);
        }
    }

    public void showInfo() {
        System.out.printf("[%s] 예금주: [%s], 잔액: [%d]원%n", accNumber, owner, balance);
    }

    public String getAccNumber() {
        return accNumber;
    }
    // 은행원의 임무는 전달받은 통장(acc)을 은행의 메인 컴퓨터(HashMap<String, Account> accounts)에 등록하는 것입니다. 해시맵에 무언가를 넣으려면 .put(Key, Value)를 써야 하죠?
    // Value(값): 당연히 건네받은 통장 객체 통째로(acc) 들어가야 합니다.
    // Key(열쇠): 이 통장을 나중에 쉽게 찾으려면 **'계좌번호'**를 Key로 써야겠죠?
    // 그런데 계좌번호는 acc 안에 private으로 꽁꽁 숨겨져 있습니다!
    // 그래서 Account 클래스 안에 계좌번호만 살짝 바깥으로 알려주는 Getter 메서드 (예: public String getAccNumber())를 만들어 두어야 합니다.
}
