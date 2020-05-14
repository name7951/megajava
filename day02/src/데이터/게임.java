package 데이터;

public class 게임 {

	public static void main(String[] args) {

		// 선언의 위치가 생존의 범위 - main 안에 선언하기
		int x = 300;
		int move = 50;
		
		System.out.println("움직인 x 자리값: " + x);
		x = x - move;
		System.out.println("움직인 x 자리값: " + x);
		x = x - move;
		System.out.println("움직인 x 자리값: " + x);
		
	}

}
