package Day44;

// 오늘 만들 것이 42일차의 최종 진화 버전이기 때문에 42일차의 로직을 대부분 그대로 사용.
public class User44 { // (회원 정보 설계도 - DTO/VO 역할)
    private String id;
    private String password;
    private String name;

    public User44(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    // 비번과 이름을 밖에서 확인할 수 있게 하는 Getter
    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    // 44일차 추가, 필요하길래.
    public String getId() { return id; }

    // 44일차 추가, 비밀번호를 바꿀 수 있도록 하는 메서드.
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
