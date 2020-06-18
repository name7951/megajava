package 상속;

import java.util.Date;

public class TimeCount extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date(); // 현재 날짜, 시간
			System.out.println(date);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
