package ���;

public class Increase extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("���� : " + i);
		}
	}
	
}
