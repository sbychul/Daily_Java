package Day36_Review11;

import java.util.HashMap;

public class GradeManager {
    private HashMap<String, Integer> grades = new HashMap<>();

    public void addGrade(String name, int score) {
        grades.put(name, score);
        System.out.printf("\uD83D\uDCDD [%s] 학생의 점수([%d]점)가 등록되었습니다.%n", name, score);
    }

    public void searchGrade(String name) {
        if (grades.containsKey(name)) { // 해당 이름에 대응하는 Value가 있다면:
            System.out.printf("\uD83D\uDD0D [%s] 학생의 점수는 [%d]점입니다.%n", name, grades.get(name));
        } else { // 없다면:
            System.out.printf("\uD83D\uDEA8 [%s] 학생의 성적 정보가 없습니다.%n", name);
        }
    }

    public void showAverage() {
        if (grades.isEmpty()) { // HashMap이 비어 있다면:
            System.out.printf("\uD83D\uDEA8 등록된 성적이 없습니다.%n");
        } else { // 비어 있지 않다면:
            int scoresSum = 0;
            for (int score : grades.values()) {
                scoresSum += score;
            }
            int scoresAvg = scoresSum / grades.size();
            System.out.printf("\uD83D\uDCCA 전체 학생 평균 점수: [%d]점%n", scoresAvg);
        }
    }
}
