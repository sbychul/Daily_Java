package Day57;

// 로그의 정보를 담는 클래스
public class LogEntry {
    private String level;
    private String time;
    private String message;

    public LogEntry(String level, String time, String message) {
        this.level = level;
        this.time = time;
        this.message = message;
    }

    public String getLevel() {
        return level;
    }

    public String getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }
}
