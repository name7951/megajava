package ���;

public class Array extends Thread {

	String[] s = { "�ܹ���", "����", "������", "�ø�", "ġŲ" };

	@Override
	public void run() {
		for (int i = 0; i < s.length; i++) {

			System.out.println("�����̸� : " + s[i]);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
