package �������;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int count; // 0���� �ʱ�ȭ�Ǿ� ����

	public static void main(String[] args) {

		JFrame frame = new JFrame("ī���� ���α׷�");
		frame.setSize(350, 300);

		JButton b1 = new JButton("1 ����");
		JButton b2 = new JButton("0���� �ʱ�ȭ");
		JButton b3 = new JButton("1 ���ϱ�");
		JLabel number = new JLabel("0");
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(String.valueOf(count));
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(String.valueOf(count));
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(String.valueOf(count));
			}
		});

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(number);

		Font font = new Font("����", Font.BOLD, 80);
		Font font1 = new Font("����", Font.BOLD, 15);
		number.setFont(font);
		number.setForeground(Color.gray);
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b1.setForeground(Color.red);
		b1.setBackground(Color.white);
		b3.setForeground(Color.blue);
		b3.setBackground(Color.white);

		frame.setVisible(true);

	}

}
