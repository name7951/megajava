package 배열심화;

public class Score {

	public static void main(String[] args) {

		int[] score1 = {100, 88, 86};
		int[] score2 = score1.clone();
		int sum1 = 0;
		int sum2 = 0;
		double average1 = (double)sum1/score1.length;
		double average2 = (double)sum2/score2.length;
		
		for (int i = 0; i < score1.length; i++) {
			System.out.println("1학기 수학 점수: " + score1[i]);
			sum1 = sum1 + score1[i];
		}
		System.out.println();
		System.out.println("총 점수: " + sum1 + "점");
		System.out.println("평균: " + ((double)sum1/score1.length) + "점");
		
		System.out.println("-------------------------");
		
		score2[0] = 88;
		
		for (int i = 0; i < score2.length; i++) {
			System.out.println("2학기 수학 점수: " + score2[i]);
			sum2 = sum2 + score2[i];
		}
		System.out.println();
		System.out.println("총 점수: " + sum2 + "점");
		System.out.println("평균: " + ((double)sum2/score2.length) + "점");
		
		if (average1 > average2) {
			System.out.println("1학기 평균이 더 높습니다");
		} else if (average1 == average2) {
			System.out.println("평균이 같습니다");
		} else {
			System.out.println("2학기 평균이 더 높습니다");
		}
		
		
	}

}
