package ���;

public class MyThread {

	public static void main(String[] args) {

		Star star = new Star();
		Dia dia = new Dia();

		// ���� ����
		star.run();
		System.out.println();
		dia.run();

		// ���� ����
		System.out.println();
		star.start();
		dia.start();

	}

}
