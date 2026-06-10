package Day59;

// 실행, 디버깅 미진행본
public class Driver {
    private String name;
    private String team;

    public Driver(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return String.format("%s / 소속 팀: %s", name, team);
    }
}
