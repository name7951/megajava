package ��������;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ������.����;

public class MainScreen {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("���� ����ȭ��1");
//		JFrame frame2 = new JFrame("���� ����ȭ��2");
		frame.setSize(300, 250);

		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);

		JButton button1 = new JButton("���ϱ�");
		JButton button2 = new JButton("��  ��");

		frame.add(button1);
		frame.add(button2);

		Font font = new Font("����", Font.BOLD, 50);

		button1.setFont(font);
		button2.setFont(font);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ϱ� ��� ó��
				���� cal = new ����();
				int result = cal.add(300, 100);
				JOptionPane.showMessageDialog(frame, "���� ���� " + result);
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ��� ó��
				���� cal = new ����();
				int result = cal.minus(300, 100);
				JOptionPane.showMessageDialog(frame, "�A ���� " + result);
			}
		});

		frame.setVisible(true);

	}

}
