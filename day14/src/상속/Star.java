package 상속;

public class Star extends Thread {

	@Override
	public void run() {
		// Thread 처리하고 싶은 부분
		for (int i = 0; i < 50; i++) {
			System.out.print("☆");
		}
	}

}
