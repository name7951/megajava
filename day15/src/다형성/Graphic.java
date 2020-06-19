package 다형성;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Graphic {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JButton	b = new JButton("button");
		JLabel label = new JLabel("label");
		JTextField text = new JTextField(10);
		
		frame.setSize(400, 500);
		frame.setLayout(new FlowLayout());
		
		// 부모 클래스가 들어갈 수 있는 자리는
		// 자식 클래스가 모두 들어갈 수 있음
		frame.add(b);
		frame.add(label);
		frame.add(text);
		
		Font font = new Font("굴림", Font.BOLD, 30);
		Font font1 = new Font("굴림", Font.BOLD, 40);
		
		frame.setFont(font);
		
		b.setFont(font);
		label.setFont(font1);
		text.setFont(font);
		
		frame.setVisible(true);
		
	}

}
