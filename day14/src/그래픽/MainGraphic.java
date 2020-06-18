package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainGraphic extends JFrame {

	JLabel l1, l2, l3; // ��������

	public MainGraphic() { // static ����

		setTitle("Thread ���α׷���");
		setSize(550, 400);
		l1 = new JLabel("1");
		l2 = new JLabel();
		l3 = new JLabel("3");

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		add(l1);
		add(l2);
		add(l3);

		Font font = new Font("����", Font.BOLD, 30);
		l1.setFont(font);
		l3.setFont(font);

		Counter counter = new Counter();
		TimeCount time = new TimeCount();
		Array array = new Array();

		counter.start();
		time.start();
		array.start();

		getContentPane().setBackground(Color.LIGHT_GRAY);

		ImageIcon image = new ImageIcon("3.png");
		l2.setIcon(image);

		setVisible(true);

	}

	// inner class(���� Ŭ����)
	public class Counter extends Thread {

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {

				l1.setText(" " + i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}

	public class TimeCount extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date(); // ���� ��¥, �ð�

				l3.setText(" " + date);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}

	public class Array extends Thread {

		String[] s = { "1.png", "2.png", "3.png", "4.png", "5.png" };

		@Override
		public void run() {
			for (int i = 0; i < s.length; i++) {

				ImageIcon image = new ImageIcon(s[i]);
				l2.setIcon(image);

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	public static void main(String[] args) {

		MainGraphic main = new MainGraphic();

	}

}
