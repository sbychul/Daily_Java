package Day32_Review7;

import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    // 해시맵에 새로운 계좌를 추가
    public void openAccount(Account acc) {
        String key = acc.getAccNumber(); // 통장에서 계좌번호만 쏙 빼와서
        accounts.put(key, acc);          // 해시맵에 등록, 계좌번호 == Key
    }

    // 계좌번호(Key)를 입력받아 해시맵에서 해당 계좌를 찾아 반환
    public Account getAccount(String accNumber) {
        return accounts.get(accNumber); // 해당 계좌, Account 객체 그 자체를 반환.
    }
}
