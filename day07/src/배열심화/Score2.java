package 배열심화;

import java.util.Random;

public class Score2 {

	public static void main(String[] args) {

		int[] score1 = new int[300];
		Random r = new Random();

		for (int i = 0; i < score1.length; i++) {
			score1[i] = r.nextInt(101); // 0~100
		}
		
		int[] score2 = score1.clone();
		
		score2[0] = 99;
		score2[100] = 55;
		score2[200] = 76;
		score2[299] = 16;
		
		for (int i = 0; i < score1.length; i++) {
			System.out.println(i+1 + ": " + score1[i] + " " + score2[i]);
		}
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < score2.length; i++) {
			sum1 = sum1 + score1[i];
			sum2 = sum2 + score2[i];
		}
		
		double average1 = (double)sum1/score1.length;
		double average2 = (double)sum2/score2.length;
		System.out.println("1학기 평균: " + ((double)sum1/score1.length) + "점");
		System.out.println("2학기 평균: " + ((double)sum2/score2.length) + "점");
		
		System.out.println("-------------------------");
		
		if (average1 > average2) {
			System.out.println("1학기 평균이 더 높습니다");
		} else if (average1 == average2) {
			System.out.println("평균이 같습니다");
		} else {
			System.out.println("2학기 평균이 더 높습니다");
		}
		
		System.out.println("-----위치는-----");
		int count = 0;
		for (int i = 0; i < score2.length; i++) {
			// 양쪽 배열에 들어있는 값이 동일한지 체크
			if (score1[i] != score2[i]) {
				count++;
				System.out.println("값이 다른 것의 위치: " + i);
			}
		}
		
		System.out.println();
		System.out.println("점수가 다른 인원 수: " + count);
		
	}

}
