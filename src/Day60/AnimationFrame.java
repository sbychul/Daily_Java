package Day60;

import java.awt.*;
import javax.swing.*;

// 손코딩 연습, 실행 및 디버깅 미진행
public class AnimationFrame extends JFrame {
    public AnimationFrame() {
        setTitle("자동 이동 버튼");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("출발");
        btn.setBounds(50, 150, 100, 50);
        btn.addActionListener(e -> new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    btn.setLocation(btn.getX() + 10, btn.getY());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {}
                }
            }
        }.start()); // 채점 이후 start() 작성, 빼먹었음

        c.add(btn);
        setVisible(true); // 채점 이후 작성, 빼먹었음
    }

    // 채점 이후 작성, 빼먹었음.
    public static void main(String[] args) {
        new AnimationFrame();
    }
}
