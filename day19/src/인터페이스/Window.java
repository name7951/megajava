package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener {

	JButton b1, b2; // 전역 변수

	public Window() {

		setTitle("My Window");
		setSize(300, 300);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		b1 = new JButton("Button1");
		b2 = new JButton("Button2");

		add(b1);
		add(b2);

		Font font = new Font("굴림", Font.BOLD, 30);

		b1.setFont(font);
		b2.setFont(font);

		getContentPane().setBackground(Color.gray);

		b1.setBackground(Color.cyan);
		b2.setBackground(Color.yellow);

//		ButtonClick click = new ButtonClick();

		b1.addActionListener(this);
		b2.addActionListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Window();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("버튼 1 눌렀음");
		}
		if (e.getSource() == b2) {
			System.out.println("버튼 2 눌렀음");
		}
	}

}
