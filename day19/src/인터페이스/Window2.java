package �������̽�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window2 extends JFrame {

	JButton b1, b2, b3; // ���� ����

	public Window2() {

		setTitle("My Window2");
		setSize(300, 300);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");

		add(b1);
		add(b2);
		add(b3);

		Font font = new Font("����", Font.BOLD, 30);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(new Font("�ü�", Font.ITALIC, 40));

		getContentPane().setBackground(Color.gray);

		b1.setBackground(Color.cyan);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.red);

//		ButtonClick click = new ButtonClick();

		// �͸� Ŭ������ ��ü ����
		// �������̽��� ��ü ���� �Ұ�
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư 1 ������");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư 2 ������");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư3 ������");
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new Window2();

	}

}
