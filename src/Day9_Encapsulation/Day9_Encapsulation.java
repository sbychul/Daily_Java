package Day9_Encapsulation;

public class    Day9_Encapsulation {
        public static void main(String[] args) {
            BankAccount myAcc = new BankAccount(1000);

            // myAcc.balance = 5000; // ⚠️ 에러 발생! (private이라서 접근 불가)

            // 오직 메서드를 통해서만 조작 가능
            myAcc.deposit(5000);  // 정상 입금
            myAcc.deposit(-3000); // 방어 코드 작동! (잔액 보호됨)

            // System.out.println(myAcc.balance); // ⚠️ 에러!
            System.out.println("현재 잔액: " + myAcc.getBalance()); // 메서드로 확인
        }
    }

    // 클래스를 만들 때 Alt + Insert를 이용하면 생성자, Getter and Setter 등을 자동으로 만드는 기능이 있음!!