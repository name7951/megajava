package 상속;

public class Array extends Thread {

	String[] s = { "햄버거", "피자", "떡볶이", "냉면", "치킨" };

	@Override
	public void run() {
		for (int i = 0; i < s.length; i++) {

			System.out.println("음식이름 : " + s[i]);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
