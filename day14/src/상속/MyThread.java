package 상속;

public class MyThread {

	public static void main(String[] args) {

		Star star = new Star();
		Dia dia = new Dia();

		// 따로 실행
		star.run();
		System.out.println();
		dia.run();

		// 동시 실행
		System.out.println();
		star.start();
		dia.start();

	}

}
