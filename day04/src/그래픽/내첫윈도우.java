package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ù������ {

	public static void main(String[] args) {
		// â ����
		// ��ư ���� â�� �ֱ�
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b = new JButton();
		b.setText("�����ּ���");
		b.setBackground(Color.yellow);
		b.setForeground(Color.green);
		f.add(b);

		JButton b1 = new JButton();
		b1.setText("�̰͵� �����ּ���");
		b1.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		f.add(b1);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// �������� ���̰� �ϴ� ��
		f.setVisible(true); 
		
	}

}
