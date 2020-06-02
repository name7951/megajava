package 배열복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Movie {

	static int now = 2; // 현재 위치
	// 변수는 만들어지는 위치가 중요
	// 선언의 위치가 변수가 살 수 있는 범위에

	public static void main(String[] args) {

		String[] list = { "cafe.png", "miss.png", "prison.png", "showman.png", "underwater.png" };
		String[] movie = {"카페", "미스", "프리즌", "쇼맨", "언더워터"};
		
		JFrame frame = new JFrame();
		JLabel title = new JLabel();
		JLabel label = new JLabel();
		JButton left = new JButton("<<<<<");
		JButton right = new JButton(">>>>>");
		FlowLayout flow = new FlowLayout();

		frame.setLayout(flow);
		frame.setSize(300, 600);
		frame.add(title);
		frame.add(label);
		frame.add(left);
		frame.add(right);

		ImageIcon image = new ImageIcon(list[now]);
		title.setText(movie[now]);
		
		label.setIcon(image);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (now > 0) { // 1~4까지만 1씩 줄일 수 있도록
					now--;
				} else {
					now = 4;
				}
				ImageIcon image = new ImageIcon(list[now]);
				label.setIcon(image);
				title.setText(movie[now]);
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (now < 4) {
					now++;
				} else {
					now = 0;
				}
				ImageIcon image = new ImageIcon(list[now]);
				label.setIcon(image);
				title.setText(movie[now]);
				
			}
		});

		Font font = new Font("굴림", Font.BOLD, 50);
		left.setFont(font);
		right.setFont(font);
		left.setBackground(Color.gray);
		right.setBackground(Color.gray);
		left.setForeground(Color.red);
		right.setForeground(Color.blue);
		title.setFont(font);

		frame.setVisible(true);

	}

}
