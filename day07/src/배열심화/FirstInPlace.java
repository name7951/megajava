package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class FirstInPlace {

	public static void main(String[] args) {

		Random r = new Random(55); // 
		int[] score = new int[10000]; // 인원 수
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(401); // 0~400 까지의 범위
		}
		// 파괴형 함수
		Arrays.sort(score);
		
		for (int x : score) {
			System.out.println(x);
		}
		System.out.println("최고 점수는 " + score[9999] + "점");
		
	}

}
