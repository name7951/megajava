package 배열;

import java.util.Random;

public class 랜덤값넣기 {

	public static void main(String[] args) {

		Random r = new Random(42);
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // 0~999
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		System.out.println("----------------------");
		// 1. 배열의 해당 index에 들어있는 값을 가져와서 찾는 값과 일치하는지 확인
		// 2. 일치하면 해당 index를 print
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 492) {
				System.out.println(i);
			}
		}
		
	}

}
