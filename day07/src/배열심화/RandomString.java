package 배열심화;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {

		String[] food = {"햄버거", "피자", "떡볶이", "치킨", "짜장면"};
		Random r = new Random();
		
		int choice = r.nextInt(5);
		System.out.println("내가 랜텀하게 선택한 값: " + food[choice]);
		
	}

}
