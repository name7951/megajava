package �迭��ȭ;

public class Score {

	public static void main(String[] args) {

		int[] score1 = {100, 88, 86};
		int[] score2 = score1.clone();
		int sum1 = 0;
		int sum2 = 0;
		double average1 = (double)sum1/score1.length;
		double average2 = (double)sum2/score2.length;
		
		for (int i = 0; i < score1.length; i++) {
			System.out.println("1�б� ���� ����: " + score1[i]);
			sum1 = sum1 + score1[i];
		}
		System.out.println();
		System.out.println("�� ����: " + sum1 + "��");
		System.out.println("���: " + ((double)sum1/score1.length) + "��");
		
		System.out.println("-------------------------");
		
		score2[0] = 88;
		
		for (int i = 0; i < score2.length; i++) {
			System.out.println("2�б� ���� ����: " + score2[i]);
			sum2 = sum2 + score2[i];
		}
		System.out.println();
		System.out.println("�� ����: " + sum2 + "��");
		System.out.println("���: " + ((double)sum2/score2.length) + "��");
		
		if (average1 > average2) {
			System.out.println("1�б� ����� �� �����ϴ�");
		} else if (average1 == average2) {
			System.out.println("����� �����ϴ�");
		} else {
			System.out.println("2�б� ����� �� �����ϴ�");
		}
		
		
	}

}
