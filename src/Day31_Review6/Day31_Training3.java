package Day31_Review6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 훈련 3: "마지막 창문을 열며" (스윙 GUI 뼈대 복기)
// 1. ActionListener 자격증 장착!
public class Day31_Training3 extends JFrame implements ActionListener {
    JButton btn;

    // 2. 생성자에서 화면 세팅하기
    public Day31_Training3() {
        setSize(300, 300); // 창 크기

        btn = new JButton("수료증 받기"); // 버튼 생성
        btn.addActionListener(this);     // 버튼에 클릭 감지기(나 자신) 달기
        add(btn);                        // 창에 버튼 붙이기

        setVisible(true); // 창 보이게 하기
    }

    // 3. 버튼이 눌렸을 때 실행될 행동 (오버라이딩)
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("🎓 자바 마스터 수료를 축하합니다!");
    }

    public static void main(String[] args) {
        new Day31_Training3(); // 프로그램 실행
    }
}

// 까먹어서 Gemini 코드 그대로 적용. 이하는 직접 기억해서 작성했던 부분 매우 조금..
// public class Day31_Training3 extends JFrame {
//    JButton btn;
//
//    public static void main(String[] args) {
//        new Day31_Training3();
//    }
//}