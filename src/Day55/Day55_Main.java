package Day55;

import javax.swing.*;
import java.awt.*;

public class Day55_Main extends JFrame {
    JButton btn;
    JLabel label;

    public Day55_Main() {
        setTitle("Gacha");
        setSize(300, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 100,20));

        label = new JLabel("한정 픽업 이벤트");
        label.setText("한정 픽업 이벤트");
        btn = new JButton("1회 뽑기 실행");
        btn.setBounds(100, 200,100, 60);

        btn.addActionListener(e -> {
            switch ((int)(Math.random() * 5 + 1)) {
                case 1 -> label.setText("★★★★ [치사]");
                case 2 -> label.setText("★★★★ [린네]");
                case 3 -> label.setText("★★★★ [모니에]");
                case 4 -> label.setText("★★★★★ [에이메스]");
                case 5 -> label.setText("★★★★★ [히유키]");
                default -> label.setText("오류가 발생했습니다.");
            }
        });

        add(label);
        add(btn);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Day55_Main();
    }
}
