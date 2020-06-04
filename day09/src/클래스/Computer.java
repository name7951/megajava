package 클래스;

public class Computer {

	public int computer(int x, int y) {
		int result = x + y;
		System.out.println("컴퓨터 한 대의 가격 : " + result + "원");
		return result;
	}

	public int total(int a, int b) {
		int total = a * b;
		System.out.println("총 컴퓨터의 가격 : " + total + "원");
		return total;
	}

}
