package Day47;

import java.io.*;
import java.util.HashMap;

// 46일차에서 좀 많이 바뀐듯, 메서드 두 개 추가. 가입, 입출금 메서드에 updateFile() 추가.
public class BankManager47 {
    // 계좌번호가 Key, Account 객체가 Value가 될 예정.
    private HashMap<String, Account47> bankDB = new HashMap<>();
    // 정보를 저장할 파일명
    private String fileName = "bank.dat";

    // 47일차 추가: 생성자. 객체가 생성되자마자 ObjectInputStream을 이용하여 파일에 있는 정보를 그대로 읽어 옴.
    public BankManager47() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // 파일에 있던 데이터를 통째로 불러와서 HashMap에 저장.
            bankDB = (HashMap<String, Account47>) ois.readObject();
        } catch (Exception e) { // 처음 실행할 땐 오류가 무조건 발생.
            System.out.println("초기화: 기존 은행 DB가 없어 새로 생성합니다.");
        }
    }

    // 47일차 추가: 데이터베이스 최신화
    public void updateFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // 무적의 한 줄. 단 한 줄로 다 저장됨 (내가 지금까지 하던 건 뭐지...)
            oos.writeObject(bankDB);
        } catch (IOException e) {
            System.out.println("데이터 업데이트 중 오류가 발생하였습니다.");
        }
    }

    // 계좌 개설. 처음 만들면 0원일테니까 금액은 받을 필요 없다는 생각.
    public void createAccount(String accNum, String ownerName) {
        if (bankDB.containsKey(accNum)) { // 계좌 번호가 중복될 때.
            System.out.println("계좌번호가 중복됩니다. 해당 번호로는 생성할 수 없습니다.");
            return;
        }
        bankDB.put(accNum, new Account47(accNum, ownerName, 0));
        System.out.printf("신규 가입을 환영합니다, %s님!%n", ownerName);
        updateFile();
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
        updateFile();
    }

    // 출금
    public void withdrawFromAccount(String accNum, long amount) {
        if (!bankDB.containsKey(accNum)) { // 계좌가 없다면
            System.out.println("해당 계좌는 존재하지 않습니다.");
            return;
        }
        if (bankDB.get(accNum).withdraw(amount)) { // 돈이 충분하다면
            System.out.printf("\uD83D\uDCB8 [%d]원이 출금되었습니다.%n", amount);
            updateFile();
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
        Account47 from = bankDB.get(fromAcc);
        Account47 to = bankDB.get(toAcc);

        if (from.withdraw(amount)) { // if문을 통과했다면 보낼 돈이 있다는 것!!
            to.deposit(amount);
            System.out.printf("\uD83D\uDD04 [%s]님이 [%s]님에게 [%d]원을 이체했습니다.%n", from.getOwnerName(), to.getOwnerName(), amount);
            updateFile();
            return;
        }

        // 돈이 없는 것!!!!!!!!!
        System.out.println("\uD83D\uDEA8 잔액이 부족합니다.");
    }

    // 46일차 추가) 입력받은 계좌번호의 내역을 출력
    public void showHistory(String accNum) {
        if (!bankDB.containsKey(accNum)) { // 계좌가 없다면
            System.out.println("존재하지 않는 계좌입니다.");
            return;
        }
        // 있다면 메서드 호출. 알아서 출력해 줌.
        System.out.printf("--- [%s]님의 거래 내역 ---%n", bankDB.get(accNum).getOwnerName());
        bankDB.get(accNum).printHistory();
    }
}
