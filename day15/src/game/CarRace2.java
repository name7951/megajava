package game;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

class CarRace2 extends JFrame {

	public CarRace2() {

		setTitle("자동차 경주 게임");
		setSize(600, 400);

		MyThread car1 = new MyThread("car1", 100, 0);
		MyThread car2 = new MyThread("car2", 100, 50);
		MyThread car3 = new MyThread("car3", 100, 100);
		MyThread car4 = new MyThread("car4", 100, 150);
		MyThread car5 = new MyThread("car5", 100, 200);
		MyThread car6 = new MyThread("car6", 100, 250);

		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		car6.start();
		setLayout(null);

		getContentPane().setBackground(Color.cyan);

		setVisible(true);

	}

	public class MyThread extends Thread {

		int x, y;
		JLabel label;

		public MyThread(String name, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel(name);
			label.setBounds(x, y, 100, 50);
			add(label);

		}

		@Override
		public void run() {
			for (int i = 0; i < 200; i++) {
				// 0~0.9999
				x += 10 * Math.random();
				System.out.println("변경된 x 축 좌표 :" + x);
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}

	public static void main(String[] args) {

		new CarRace2(); // 익명 클래스

	}

}
