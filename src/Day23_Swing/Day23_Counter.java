package Day23_Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Day23_Counter extends JFrame implements ActionListener {

    JLabel label;
    JButton button;
    int count = 0;

    public Day23_Counter() {
        setTitle("강화하기");
        setSize(300,200);
        setLayout(null);

        label = new JLabel("현재 강화 수치: 0");
        label.setBounds(90, 100, 200, 30);

        button = new JButton("강화하기 \uD83D\uDD28");
        button.setBounds(80, 50, 120, 40);
        button.addActionListener(this);

        add(label);
        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("현재 강화 수치: " + count);
    }



    public static void main(String[] args) {
        new Day23_Counter();
    }
}
