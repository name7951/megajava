package ���;

public class Counter extends Thread {

	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}