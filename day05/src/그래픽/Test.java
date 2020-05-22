package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		JButton spring = new JButton();
		spring.setText(" 봄 ");
		spring.setBackground(Color.pink);
		spring.setForeground(Color.GREEN);
		
		JButton summer = new JButton();
		summer.setText("여름");
		summer.setBackground(Color.green);
		summer.setForeground(Color.PINK);		
		
		frame.add(spring);
		frame.add(summer);
		
		Font font = new Font("굴림", Font.BOLD, 50);
		spring.setFont(font);
		summer.setFont(font);
		
		spring.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "선선합니다");
			}
		});
		summer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "덥습니다");
			}
		});
		
		
		frame.setVisible(true);
		
	}

}
