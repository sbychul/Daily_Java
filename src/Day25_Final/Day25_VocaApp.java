package Day25_Final;

import java.io.FileWriter;          // 파일 수정에 필요한 FileWriter
import java.io.BufferedReader;      // 파일을 빠르게 읽어낼 펌프 BufferedReader
import java.io.FileReader;          // 파일을 읽어줄 FileReader
import java.io.IOException;         // 파일 오류를 잡아낼 IOException
import javax.swing.*;               // 창을 만들 Swing
import java.awt.event.ActionEvent;      // 버튼을 눌렀을 시 효과를 부여할 ActionEvent, Listener
import java.awt.event.ActionListener;

public class Day25_VocaApp extends JFrame implements ActionListener {

    String engText;
    String korText;

    JButton save;   // 저장 버튼
    JButton load;   // 불러오기 버튼

    JLabel label;   // 저장, 불러오기 상태를 표시할 라벨.

    JTextField engArea;     // 영어를 작성할 위치
    JTextField korArea;     // 한글을 작성할 위치
    JTextArea everyWords;   // 불러온 단어를 표시할 위치

    public Day25_VocaApp() {
        setTitle("나만의 영단어장");
        setSize(480,600);
        setLayout(null);

        save = new JButton("저장하기");
        save.setBounds(100, 460, 120, 40);
        save.addActionListener(this);

        load = new JButton("불러오기");
        load.setBounds(240, 460, 120, 40);
        load.addActionListener(this);

        label = new JLabel("위 칸에 영단어를, 아래 칸에 뜻을 입력하세요.");
        label.setBounds(100, 500, 300, 30);

        engArea = new JTextField();
        engArea.setBounds(135, 80, 200, 40);
        korArea = new JTextField();
        korArea.setBounds(135, 140, 200, 40);

        everyWords = new JTextArea();
        everyWords.setBounds(135, 200, 200, 200);


        add(engArea);
        add(korArea);
        add(everyWords);
        add(label);
        add(save);
        add(load); // 모든 기능과 요소 추가

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) { // 눌린 버튼이 저장하기일 경우.
            engText = engArea.getText();
            korText = korArea.getText(); // 영단어와 뜻을 변수에 저장.
            engArea.setText("");
            korArea.setText(""); // 입력받는 칸을 공란으로 정리.

            try (FileWriter writer = new FileWriter("voca.txt", true)) { // 파일을 작성하기 위해 불러옴.
                writer.write(engText + " : " + korText + "\n"); // (영단어) : (뜻) 형식으로 저장.
                label.setText("저장이 성공적으로 완료되었습니다."); // 저장이 완료되었음을 표시.
            }
            catch (IOException ioe) { // 오류 발생 시
                label.setText("🚨 파일 저장 중 오류가 발생했습니다.");
            }
        }

        else {  // 저장하기와 불러오기 버튼 두 개 뿐이니, 아니라면 불러오기.
            try (BufferedReader br = new BufferedReader(new FileReader("voca.txt"))) { // 파일을 읽기 위해 불러옴.
                everyWords.setText("");
                String text; // 글을 불러오기 위한 변수
                while ((text = br.readLine()) != null) { // 파일의 끝(null)에 도달할 때까지 한 줄씩 계속 읽어오기
                    everyWords.append(text + "\n"); // 표시 구역에 한 줄씩 기입.
                    label.setText("불러오기가 성공적으로 완료되었습니다."); // 불러오기가 완료되었음을 표시.
                }
            } catch (IOException ioe) { // 오류 발생 시
                label.setText("🚨 파일을 불러오는 중 오류가 발생했습니다.");
            }
        }
    }

    public static void main(String[] args) {
        new Day25_VocaApp(); // 실행. 끝.
    }
}
