package exercise;

import java.util.Random;

public class Compare2 {

	public static void main(String[] args) {

		int[] score1 = new int[300]; // 300개의 저장소 생성
		Random r = new Random(2); // 아무 숫자가 들어가도 상관없음 같은 랜덤 값 나오게 하기 위해
		for (int i = 0; i < score1.length; i++) {
			score1[i] = r.nextInt(101); // 점수의 범위 0~100
		}

		int[] score2 = score1.clone();
		score2[0] = 99;
		score2[100] = 80;
		score2[200] = 50;
		score2[299] = 66;

		for (int i = 0; i < score2.length; i++) {
			System.out.println(i + 1 + "번: " + score1[i] + " " + score2[i]);
		}

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < score2.length; i++) {
			sum1 = sum1 + score1[i];
			sum2 = sum2 + score2[i];
		}

		double average1 = (double) sum1 / score1.length;
		double average2 = (double) sum2 / score2.length;

		System.out.println("1학기 평균 : " + average1 + "점");
		System.out.println("2학기 평균 : " + average2 + "점");

		if (average1 > average2) {
			System.out.println("1학기 평균이 더 높음");
		} else if (average1 == average2) {
			System.out.println("평균이 같음");
		} else {
			System.out.println("2학기 평균이 더 높음");
		}

		System.out.println("-----------------");

		int count = 0;
		for (int i = 0; i < score2.length; i++) {
			if (score1[i] != score2[i]) {
				System.out.println("점수가 다른 위치는 : " + i);
				count++;
			}
		}
		System.out.println("점수가 다른 것의 개수 : " + count);

	}

}
