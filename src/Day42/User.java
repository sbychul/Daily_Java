package Day42;

public class User { // (회원 정보 설계도 - DTO/VO 역할)
    private String id;
    private String password;
    private String name;

    public User(String id, String password, String name) {
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
}
