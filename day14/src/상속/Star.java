package ���;

public class Star extends Thread {

	@Override
	public void run() {
		// Thread ó���ϰ� ���� �κ�
		for (int i = 0; i < 50; i++) {
			System.out.print("��");
		}
	}

}
