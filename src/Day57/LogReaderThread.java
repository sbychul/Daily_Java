package Day57;

import java.io.*;
import java.util.ArrayList;

public class LogReaderThread extends Thread {
    private final String filename;
    private final ArrayList<LogEntry> sharedList;

    public LogReaderThread(String filename, ArrayList<LogEntry> sharedList) {
        this.filename = filename;
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String logLine[] = line.split("/");
                synchronized (sharedList) {
                    sharedList.add(new LogEntry(logLine[0], logLine[1], logLine[2]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 불러오는 중 오류가 발생하였습니다.");
        }
    }
}
