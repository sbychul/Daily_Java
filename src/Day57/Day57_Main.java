package Day57;

import java.util.ArrayList;

public class Day57_Main {
    public static void main(String[] args) {
        ArrayList<LogEntry> totalLogs = new ArrayList<>();
        LogReaderThread s1Thread = new LogReaderThread("server1.txt", totalLogs);
        LogReaderThread s2Thread = new LogReaderThread("server2.txt", totalLogs);

        s1Thread.start();
        s2Thread.start();

        try {
            s1Thread.join();
            s2Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("[로그 수집 결과, 총 %d개의 로그 발견]", totalLogs.size()));
        System.out.println("[위험 로그 분석 리포트 (WARN / ERROR)]");
        totalLogs.stream() // 경고와 에러 부분만 걸러내 출력
                .filter(log -> log.getLevel().equals("WARN") || log.getLevel().equals("ERROR"))
                .forEach(log -> System.out.println(String.format("- [%s] 발생 시간: %s | 메시지: %s", log.getLevel(), log.getTime(), log.getMessage())));
    }
}
