package ������;

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
		
		// �θ� Ŭ������ �� �� �ִ� �ڸ���
		// �ڽ� Ŭ������ ��� �� �� ����
		frame.add(b);
		frame.add(label);
		frame.add(text);
		
		Font font = new Font("����", Font.BOLD, 30);
		Font font1 = new Font("����", Font.BOLD, 40);
		
		frame.setFont(font);
		
		b.setFont(font);
		label.setFont(font1);
		text.setFont(font);
		
		frame.setVisible(true);
		
	}

}
