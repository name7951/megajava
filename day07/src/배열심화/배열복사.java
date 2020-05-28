package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {

		int x = 100;
		int y = x; // 기본형의 복사
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		System.out.println();
		
		x = 200;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
