package Day42;

import java.util.HashMap;

public class AuthManager { // (인증 관리자 - DB 역할)
    private HashMap<String, User> userDB = new HashMap<>(); // id가 Key, User 정보가 Value.

    public void register(String id, String password, String userName) { // 회원가입
        if (userDB.containsKey(id)) { // 아이디 중복확인, 중복이면
            System.out.println("🚨 이미 사용 중인 아이디입니다.");
            return;
        }
        // 없다면
        userDB.put(id, new User(id, password, userName)); // 새 User 객체를 DB에 저장.
        System.out.printf("\uD83C\uDF89 회원가입 성공! [%s]님 환영합니다.%n", userName);
    }

    public void login(String id, String password) { // 로그인
        if (!userDB.containsKey(id)) { // 아이디가 없음
            System.out.println("🚨 존재하지 않는 아이디입니다.");
            return; // Guard Clause
        }

        // 있음, 비밀번호 체크
        if (!password.equals(userDB.get(id).getPassword())) { // 비밀번호가 일치하지 않음
            System.out.println("🚨 비밀번호가 일치하지 않습니다.");
            return; // Guard Clause
        }

        // 비밀번호도 일치함, 성공
        System.out.printf("\uD83D\uDD13 로그인 성공! [%s]님, 오늘도 즐거운 하루 보내세요!%n", userDB.get(id).getName());

    }
}
