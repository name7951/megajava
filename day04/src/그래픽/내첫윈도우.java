package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 내첫윈도우 {

	public static void main(String[] args) {
		// 창 띄우기
		// 버튼 만들어서 창에 넣기
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b = new JButton();
		b.setText("눌러주세요");
		b.setBackground(Color.yellow);
		b.setForeground(Color.green);
		f.add(b);

		JButton b1 = new JButton();
		b1.setText("이것도 눌러주세요");
		b1.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		f.add(b1);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 프레임이 보이게 하는 것
		f.setVisible(true); 
		
	}

}
