package 정리문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import 생성자.계산기;

public class MainScreen {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("나의 메인화면1");
//		JFrame frame2 = new JFrame("나의 메인화면2");
		frame.setSize(300, 250);

		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);

		JButton button1 = new JButton("더하기");
		JButton button2 = new JButton("빼  기");

		frame.add(button1);
		frame.add(button2);

		Font font = new Font("굴림", Font.BOLD, 50);

		button1.setFont(font);
		button2.setFont(font);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 더하기 기능 처리
				계산기 cal = new 계산기();
				int result = cal.add(300, 100);
				JOptionPane.showMessageDialog(frame, "더한 값은 " + result);
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 빼기 기능 처리
				계산기 cal = new 계산기();
				int result = cal.minus(300, 100);
				JOptionPane.showMessageDialog(frame, "뺸 값은 " + result);
			}
		});

		frame.setVisible(true);

	}

}
