package exercise;

public class Compare {

	public static void main(String[] args) {

		int[] score1 = { 100, 88, 96 };
		int[] score2 = score1.clone();
		score2[0] = 99;

		for (int i = 0; i < score2.length; i++) {
			System.out.println(score1[i] + " " + score2[i]);
		}

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < score2.length; i++) {
			sum1 = sum1 + score1[i];
			sum2 = sum2 + score2[i];
		}

		double average1 = (double) sum1 / score1.length;
		double average2 = (double) sum2 / score2.length;

		System.out.println("1�б� ��� : " + average1);
		System.out.println("2�б� ��� : " + average2);

		if (average1 > average2) {
			System.out.println("1�б� ����� �� ����");
		} else if (average1 == average2) {
			System.out.println("����� ����");
		} else {
			System.out.println("2�б� ����� �� ����");
		}

	}

}
