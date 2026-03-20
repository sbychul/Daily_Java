package Day44;

import Day42.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

// 오늘 만들 것이 42일차의 최종 진화 버전이기 때문에 43일차의 로직도 대부분 그대로 사용.
// 비번 바꾸기, 회원 삭제 추가!!
public class AuthManager44 { // (인증 관리자 - DB 역할)
    private HashMap<String, User44> userDB = new HashMap<>(); // id가 Key, User 정보가 Value.
    private String fileName = "users.txt"; // 43일차 추가! 데이터를 저장할 파일명

    public AuthManager44() { // 43일차의 핵심 1, 프로그램이 켜질 때 DB 불러오기.
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // DB를 BufferedReader로 불러옴.
            String line;
            while ((line = br.readLine()) != null) {    // 파일 끝까지 한 줄씩 불러와서 line 변수에 저장.
                String[] data = line.split(","); // String의 배열 Data에 line이 읽어온 내용의 쉼표 기준으로 쪼개서 저장.
                userDB.put(data[0], new User44(data[0], data[1], data[2])); // 0 - id, 1 - pw, 2 - name. 읽어온 정보를 바탕으로 새 user 객체를 userDB에 저장.
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
        userDB.put(id, new User44(id, password, userName)); // 새 User 객체를 DB에 저장.
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

    // 44일차의 핵심 도우미. 파일을 통째로 다시 쓰기 위한 전용 메서드.
    public void updateFile() {
        try (FileWriter writer = new FileWriter(fileName)) { // 덮어쓰기 모드, 이어쓰기 아님.
            for (User44 user : userDB.values()) { // userDB의 Value값만을 탐색, User 객체를 user 변수에 넣어서 밑의 코드(파일 작성) 실행.
                writer.write(user.getId() + "," + user.getPassword() + "," + user.getName() + "\n");
                // 파일을 새로운 정보 (아이디, 비번, 이름)로 덮어쓰는 과정.
            }
        } catch (IOException e) {
            System.out.println("DB와 연동하는 중 오류가 발생했습니다.");
        }
    }

    // 44일차 신규 메서드 1: 비밀번호 변경
    public void changePassword(String id, String oldPw, String newPw) {
        if (!userDB.containsKey(id)) { // 검사 1, 아이디가 있는가?
            System.out.println("존재하지 않는 아이디입니다. 처음으로 되돌아갑니다.");
            return; // 가입부터 하쇼.
        }
        if (!userDB.get(id).getPassword().equals(oldPw)) { // 검사 2, 비밀번호가 일치한가?
            System.out.println("기존 비밀번호가 일치하지 않습니다. 처음으로 되돌아갑니다.");
            return; // 비번부터 제대로 치쇼.
        }
        userDB.get(id).setPassword(newPw); // 모두 맞으면 HashMap 내 User 객체의 비밀번호를 변경.
        updateFile(); // updateFile 메서드 호출. 데이터 파일을 변경된 값으로 동기화.
        System.out.println("🔄 비밀번호가 성공적으로 변경되었습니다.");
    }

    // 44일차 신규 메서드 2: 회원 탈퇴
    public void deleteUser(String id, String pw) {
        if (!userDB.containsKey(id)) { // 검사 1, 아이디가 맞는가?
            System.out.println("존재하지 않는 아이디입니다. 처음으로 되돌아갑니다.");
            return; // 가입부터 하쇼.
        }
        if (!userDB.get(id).getPassword().equals(pw)) { // 검사 2, 비밀번호가 일치한가?
            System.out.println("비밀번호가 일치하지 않습니다. 처음으로 되돌아갑니다.");
            return; // 비번부터 제대로 치쇼.
        }
        userDB.remove(id); // HashMap에서 해당 키와 값을 제거
        updateFile(); // updateFile 메서드 호출. 데이터 파일을 해당 계정이 제거된 상태로 동기화.
        System.out.println("\uD83D\uDC4B 회원 탈퇴가 완료되었습니다. 이용해 주셔서 감사합니다.");
    }
}
