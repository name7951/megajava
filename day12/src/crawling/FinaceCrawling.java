package crawling;

// ���̹�����ũ�Ѹ�3 ���� �������
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinaceCrawling {

	public static void main(String[] args) {

		JFrame frame = new JFrame("�ֽ� ��Ȳ");
		FlowLayout flow = new FlowLayout();

		JButton b1 = new JButton("��Ʈ����");
		JButton b2 = new JButton("�Ｚ����");
		JButton b3 = new JButton("īī��");
		JButton b4 = new JButton("ũ�Ѹ� ����");
		JLabel label = new JLabel("�ڵ� ��ȣ : ");
		JTextField input = new JTextField(8);
		JTextArea result = new JTextArea(5, 10);

		Font font = new Font("����", Font.BOLD, 30);
		Font font1 = new Font("����", Font.BOLD, 25);

		frame.setSize(310, 550);
		frame.getContentPane().setBackground(Color.lightGray);
		result.setEnabled(false); // �Է�â�� �Է� �Ұ���

		frame.setLayout(flow);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(label);
		frame.add(input);
		frame.add(b4);
		frame.add(result);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		label.setFont(font);
		input.setFont(font);
		result.setFont(font1);

		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.cyan);

		label.setForeground(Color.blue);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				
				String data = "068270";
				���̹�����ũ�Ѹ�3 naver = new ���̹�����ũ�Ѹ�3();
				String[] value = naver.naver(data);
				result.append("���簡 : " + value[0] + "\n");
				result.append("���� : " + value[1] + "\n");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				
				String data = "005930";
				���̹�����ũ�Ѹ�3 naver = new ���̹�����ũ�Ѹ�3();
				naver.naver(data);
				String[] value = naver.naver(data);
				result.append("���簡 : " + value[0] + "\n");
				result.append("���� : " + value[1] + "\n");
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				
				String data = "035720";
				���̹�����ũ�Ѹ�3 naver = new ���̹�����ũ�Ѹ�3();
				naver.naver(data);
				String[] value = naver.naver(data);
				result.append("���簡 : " + value[0] + "\n");
				result.append("���� : " + value[1] + "\n");
			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				
				String data = input.getText();
				���̹�����ũ�Ѹ�3 naver = new ���̹�����ũ�Ѹ�3();
				String[] value = naver.naver(data);
				result.append("���簡 : " + value[0] + "\n");
				result.append("���� : " + value[1] + "\n");
			}
		});

		frame.setVisible(true);

	}

}
