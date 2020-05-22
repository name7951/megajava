package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test2 {
	
	static double finalnumber = 0;

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(1000, 500);
		
		JLabel img = new JLabel();
		frame.add(img);
		
		ImageIcon icon = new ImageIcon("cal.jpg");
		img.setIcon(icon);
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		JLabel n1 = new JLabel("숫자 1");
		JLabel n2 = new JLabel("숫자 2");
		JLabel result = new JLabel("결과");
		
		
		JTextField t1 = new JTextField(4);
		t1.setBackground(Color.gray);
		t1.setForeground(Color.red);
		JTextField t2 = new JTextField(4);
		t2.setBackground(Color.gray);
		t2.setForeground(Color.red);
		
		JButton plus = new JButton("+");
		plus.setBackground(Color.blue);
		JButton minus = new JButton("-");
		minus.setBackground(Color.blue);
		JButton multi = new JButton("*");
		multi.setBackground(Color.blue);
		JButton div = new JButton("/");
		div.setBackground(Color.blue);
		
		
		Font font = new Font("맑은 고딕", Font.BOLD, 50);
		n1.setFont(font);
		n2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		multi.setFont(font);
		div.setFont(font);
		result.setFont(font);
		
		frame.add(n1);
		frame.add(t1);
		frame.add(n2);
		frame.add(t2);
		frame.add(plus);
		frame.add(minus);
		frame.add(multi);
		frame.add(div);
		frame.add(result);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야함
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num01 = Integer.parseInt(num1);
				int num02 = Integer.parseInt(num2);
				// 두 수를 더해서 출력
				finalnumber = num01 + num02;
				result.setText(finalnumber+"");
			}
		});
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야함
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num01 = Integer.parseInt(num1);
				int num02 = Integer.parseInt(num2);
				// 두 수를 더해서 출력
				finalnumber = num01 - num02;
				result.setText(finalnumber+"");
			}
		});
		multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야함
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num01 = Integer.parseInt(num1);
				int num02 = Integer.parseInt(num2);
				// 두 수를 더해서 출력
				finalnumber = num01 * num02;
				result.setText(finalnumber+"");
			}
		});
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야함
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num01 = Integer.parseInt(num1);
				int num02 = Integer.parseInt(num2);
				// 두 수를 더해서 출력
				finalnumber = num01 / num02;
				result.setText(finalnumber+"");
			}
		});
		
		
		frame.setVisible(true);
		
	}

}
