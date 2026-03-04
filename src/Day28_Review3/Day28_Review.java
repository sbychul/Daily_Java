package Day28_Review3;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.InterruptedException;

// 훈련 2: "카운트다운 타이머" (스레드 - Thread)
class TimeThread extends Thread {
    @Override
    public void run() { // Thread의 기본 메서드인 run()을 오버라이드
        for (int i = 3; i > 0; i--) { // i를 3부터 줄여가며 반복, 출력하는 데 사용
            System.out.printf("%d%n", i);
            try { Thread.sleep(1000); }
            catch (InterruptedException e) { // sleep을 사용하기 위해 잡아야 하는 오류.
                System.out.println("오류 발생! 끼얏호우");
            }
            // 해설:
            // Thread.sleep()을 쓸 때는 반드시 강제로 try-catch를 써서 InterruptedException을 잡아주어야 합니다. (이걸 'Checked Exception'이라고 부릅니다.)
            // 이유가 뭐냐면요: 스레드가 쿨쿨 자고(sleep) 있을 때,
            // 프로그램의 다른 부분에서 "야! 당장 일어나서 일해!" 하고 강제로 깨울 수 있는 기능(.interrupt())이 자바에 있습니다.
            // 자바는 **"만약 자고 있는데 누가 갑자기 깨우면 어떡할 거야? 그 상황에 대한 대책(catch)을 무조건 세워놔!"**라고 강요하는 것입니다.
            // 그래서 안 쓰면 빨간 줄이 뜨면서 실행조차 안 되는 거죠!
        }
    }
}

// 훈련 3: "내 정체를 밝혀라!" (Object - toString 오버라이딩)
class Student {
    String name; // 이름과 학년을 가짐.
    int grade;

    public Student(String name, int grade) { // 생성자
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() { // Object 클래스의 toString() 메서드를 오버라이드.
        return "[" + grade + "]학년 [" + name + "] 학생입니다."; // 요구하는 문자열로 반환
    }
}


public class Day28_Review {
    public static void main(String[] args) {
        // 훈련 1: "나만의 비밀 일기장" (파일 입출력 - FileWriter)
        try (FileWriter f = new FileWriter("secret.txt")) { // secret.txt라는 파일은 수정하기 위해 새 FileWriter 형성
            f.append("야호");
            System.out.println("파일이 성공적으로 저장되었습니다.");
            // try-catch문을 이용해 FileWriter를 만들었기 때문에 f.close를 해줄 필요가 없음 (자동으로 닫힘)
        } catch (IOException e) { // 파일 수정 중 오류가 발생하였을 때.
            System.out.println("파일을 찾을 수 없습니다.");
            System.out.printf("원인: %s", e.getMessage());
        }

        // 훈련 2: "카운트다운 타이머" (스레드 - Thread)
        TimeThread tt = new TimeThread();
        tt.run(); // 상단에서 만든 TimeThread를 실행.
        // 감점 요인: 스레드를 호출할 때는 .run()이 아닌 .start()를 사용하기.

        // 훈련 3: "내 정체를 밝혀라!" (Object - toString 오버라이딩)
        Student me = new Student("sbc", 2);
        System.out.printf("%s", me.toString());
        // 추가 팁: System.out.println(me)를 해도 자바에서 바로 오버라이드된 .toString()을 실행해 줌.
    }
}
