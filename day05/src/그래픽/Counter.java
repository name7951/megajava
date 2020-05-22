package �׷���;

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
		
		
		// ��ü Ʋ ��ǰ
		JFrame frame = new JFrame();
		frame.setSize(300, 150); // �������� ũ�� ����
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow); // �����ִ´�� ȭ�鿡 ǥ��
		
		// ��ư 2�� ��ǰ
		JButton minus = new JButton();
		minus.setText("-"); // ��ư ���� ǥ��� �ؽ�Ʈ ����
		minus.setBackground(Color.pink); // �ؽ�Ʈ �� ����
		
		JButton plus = new JButton();
		plus.setText("+");
		plus.setBackground(Color.green);
		
		// �� ��ǰ - �۾� ���� �� ���
		JLabel num = new JLabel("0"); // ȭ�鿡 ǥ��� �ؽ�Ʈ ���� 
		
		// ��ư�� ������ ���� ǥ�� �ǵ��� ����
		frame.add(minus);
		frame.add(num);
		frame.add(plus);
		
		// ��Ʈ ����
		Font font = new Font("����", Font.BOLD, 50);
		// num�� ��Ʈ ����
		num.setFont(font);
				
		Font font1 = new Font("�ü�", Font.BOLD, 50);
		// ��ư�� ��Ʈ ����
		minus.setFont(font1);
		plus.setFont(font1);

		// ���콺�� �Է����� ó���� �� �ֵ��� ����� ��
		// �ֿܼ� ���
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���̳ʽ� ��ư ����");
				count--;
				System.out.println("count: " + count);
				num.setText(count+"");
			}
		});
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�÷��� ��ư ����");
				count++;
				System.out.println("count: " + count);
				num.setText(count+"");
			}
		});
		
		frame.setVisible(true); // �� ��� �͵��� �����ӿ� ǥ�� �� �� �ֵ���
		
	}

}
