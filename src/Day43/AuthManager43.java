package Day43;

import Day42.User; // 42일차의 User를 그대로 사용!!

import java.io.*;
import java.util.HashMap;

// 오늘 만들 것이 42일차의 진화 버전이기 때문에 로직을 그대로 사용.
// File I/O가 추가된 업그레이드 진행.
public class AuthManager43 { // (인증 관리자 - DB 역할)
    private HashMap<String, User> userDB = new HashMap<>(); // id가 Key, User 정보가 Value.
    private String fileName = "users.txt"; // 43일차 추가! 데이터를 저장할 파일명

    public AuthManager43() { // 43일차의 핵심 1, 프로그램이 켜질 때 DB 불러오기.
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // DB를 BufferedReader로 불러옴.
            String line;
            while ((line = br.readLine()) != null) {    // 파일 끝까지 한 줄씩 불러와서 line 변수에 저장.
                String[] data = line.split(","); // String의 배열 Data에 line이 읽어온 내용의 쉼표 기준으로 쪼개서 저장.
                userDB.put(data[0], new User(data[0], data[1], data[2])); // 0 - id, 1 - pw, 2 - name. 읽어온 정보를 바탕으로 새 user 객체를 userDB에 저장.
            }
        } catch (Exception e) { // 처음 실행할 땐 users.txt 파일이 없기에 무조건 생길 에러.
            System.out.println("초기화: 기존 회원 DB 파일이 없습니다. 새로 생성합니다.");
        }
    }

    // 43일차의 핵심 2, 파일에도 회원 정보 저장하기.
    public void register(String id, String password, String userName) { // 회원가입
        if (userDB.containsKey(id)) { // 아이디 중복확인, 중복이면
            System.out.println("🚨 이미 사용 중인 아이디입니다.");
            return;
        }
        // 없다면
        userDB.put(id, new User(id, password, userName)); // 새 User 객체를 DB에 저장.
        try (FileWriter writer = new FileWriter(fileName, true)) { // 새 FileWriter 생성, 이어쓰기 모드.
            writer.write(id + "," + password + "," + userName + "\n"); // 해당 형식으로 저장하여, 불러올 때 읽어올 예정.
        } catch (IOException e) {
            System.out.println("DB에 저장하는 중 오류가 발생했습니다.");
        }
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
