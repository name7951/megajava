package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int count = 0;

	public static void main(String[] args) {
		
		
		// 전체 틀 부품
		JFrame frame = new JFrame();
		frame.setSize(300, 150); // 프레임의 크기 설정
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow); // 적혀있는대로 화면에 표출
		
		// 버튼 2개 부품
		JButton minus = new JButton();
		minus.setText("-"); // 버튼 위에 표출될 텍스트 설정
		minus.setBackground(Color.pink); // 텍스트 색 지정
		
		JButton plus = new JButton();
		plus.setText("+");
		plus.setBackground(Color.green);
		
		// 라벨 부품 - 글씨 넣을 떄 사용
		JLabel num = new JLabel("0"); // 화면에 표출될 텍스트 설정 
		
		// 버튼을 프레임 위에 표출 되도록 설정
		frame.add(minus);
		frame.add(num);
		frame.add(plus);
		
		// 폰트 설정
		Font font = new Font("굴림", Font.BOLD, 50);
		// num의 폰트 설정
		num.setFont(font);
				
		Font font1 = new Font("궁서", Font.BOLD, 50);
		// 버튼의 폰트 설정
		minus.setFont(font1);
		plus.setFont(font1);

		// 마우스의 입력으로 처리할 수 있도록 만드는 것
		// 콘솔에 출력
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("마이너스 버튼 누름");
				count--;
				System.out.println("count: " + count);
				num.setText(count+"");
			}
		});
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("플러스 버튼 누름");
				count++;
				System.out.println("count: " + count);
				num.setText(count+"");
			}
		});
		
		frame.setVisible(true); // 이 모든 것들이 프레임에 표출 될 수 있도록
		
	}

}
