package �迭����;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �������迭 {

	public static void main(String[] args) {
		// ������ Ÿ���� �������� ���
		JButton[] buttons = new JButton[500];
		for (int i = 0; i < buttons.length; i++) {
			JButton b = new JButton(i+1 + "��");
			buttons[i] = b;
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getSource()); // � ��ư�� �������� �� �� ����
				}
			});
		}
		
		JFrame frame = new JFrame();
		frame.setSize(620, 600);
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		for (int i = 0; i < buttons.length; i++) {
			frame.add(buttons[i]);
		}
		
		frame.setVisible(true);
		
	}

}
