package Day23_Swing;

import javax.swing.*; // 스윙 부품들을 가져옵니다.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. JFrame(도화지)을 상속받고, ActionListener(클릭 감지기) 규격서를 장착합니다!
public class Day23_Main extends JFrame implements ActionListener {

    JButton btn;  // 버튼
    JLabel label; // 글씨판

    // 생성자: 프로그램이 켜질 때 화면을 세팅합니다.
    public Day23_Main() {
        setTitle("나의 첫 윈도우 창"); // 창 제목
        setSize(300, 200);           // 창 크기 (가로, 세로)
        setLayout(null);             // 내 마음대로 위치를 지정하겠다! (자유 배치)

        // 2. 버튼 만들기
        btn = new JButton("나를 눌러봐!");
        btn.setBounds(80, 50, 120, 40); // x좌표, y좌표, 가로길이, 세로길이
        btn.addActionListener(this);    // ⭐️ 버튼에 클릭 감지기(나 자신)를 달아줌!

        // 3. 라벨 만들기
        label = new JLabel("버튼을 누르기 전입니다.");
        label.setBounds(70, 100, 200, 30);

        // 4. 도화지에 부품들 올려놓기
        add(btn);
        add(label);

        // 5. 창 설정 마무리
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창의 X버튼 누르면 프로그램 완전 종료!
        setVisible(true); // "자, 이제 화면에 보여라!"
    }

    // 6. 인터페이스의 필수 구현 메서드 (버튼을 누를 때마다 여기가 실행됨!)
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("앗! 버튼이 클릭되었습니다! 😆");
    }



    public static void main(String[] args) {
        new Day23_Main(); // 객체를 생성하면 생성자가 실행되면서 창이 뜹니다.
    }
}