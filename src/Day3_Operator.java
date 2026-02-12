import java.util.Scanner;

public class Day3_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 산술 연산 함정 (정수 나누기)
        System.out.print("점수 2개를 입력하세요(스페이스로 구분): ");
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        // 1. 산술 연산자: "Python 개발자가 빠지는 함정"
        // Python에서는 10 / 4를 하면 자동으로 2.5가 됩니다. 하지만 자바는 C언어와 똑같습니다.
        // 정수 / 정수 = 정수 (소수점 버림)
        // 10 / 4 → 2 (2.5 아님!)
        // 자바에서 소수점까지 결과를 얻으려면, 둘 중 하나를 강제로 실수(double)로 만들어야 합니다. 이를 **캐스팅(Casting)**이라고 합니다.

        // 틀린 평균 계산 (정수끼리 나누면 소수점 날아감)
        System.out.println("잘못된 평균: " + (score1 + score2) / 2);
        // 올바른 평균 계산 (2를 2.0으로 쓰거나, 형변환) <= Casting
        System.out.println("올바른 평균: " + (score1 + score2) / 2.0);

        // 2. 문자열 비교 함정
        System.out.print("비밀번호(java)를 입력하세요: ");
        String pw = sc.next();

        // 2. 비교 연산자: "C/Python 개발자가 모두 빠지는 함정" (중요 ⭐⭐⭐)
        // 오늘 수업의 핵심입니다. 문자열(String)을 비교할 때 절대로 ==를 쓰면 안 됩니다.
        // C언어: strcmp(s1, s2) == 0을 썼습니다.
        // Python: s1 == s2라고 쓰면 내용을 비교해 줍니다.
        // Java: s1 == s2라고 쓰면 **"메모리 주소(번지수)"**를 비교합니다.

        // 내용이 똑같이 "Hello"여도, 만들어진 위치(주소)가 다르면 false가 나옵니다. 자바에서 문자열의 내용이 같은지 확인하려면 반드시 .equals() 기능을 써야 합니다.

        // 주의: 문자열 리터럴("java")을 먼저 쓰는 것이 안전합니다. ("java".equals(pw))
        boolean isMatchWrong = (pw == "java");      // 주소 비교 (대부분 false)
        boolean isMatchCorrect = pw.equals("java"); // 내용 비교 (우리가 원하는 것)

        System.out.printf("== 비교 결과: %b%n", isMatchWrong);
        System.out.printf("equals 비교 결과: %b%n", isMatchCorrect);

        sc.close();
    }
}