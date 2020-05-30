package exercise;

import java.util.Random;

public class Compare2 {

	public static void main(String[] args) {

		int[] score1 = new int[300]; // 300���� ����� ����
		Random r = new Random(2); // �ƹ� ���ڰ� ���� ������� ���� ���� �� ������ �ϱ� ����
		for (int i = 0; i < score1.length; i++) {
			score1[i] = r.nextInt(101); // ������ ���� 0~100
		}

		int[] score2 = score1.clone();
		score2[0] = 99;
		score2[100] = 80;
		score2[200] = 50;
		score2[299] = 66;

		for (int i = 0; i < score2.length; i++) {
			System.out.println(i + 1 + "��: " + score1[i] + " " + score2[i]);
		}

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < score2.length; i++) {
			sum1 = sum1 + score1[i];
			sum2 = sum2 + score2[i];
		}

		double average1 = (double) sum1 / score1.length;
		double average2 = (double) sum2 / score2.length;

		System.out.println("1�б� ��� : " + average1 + "��");
		System.out.println("2�б� ��� : " + average2 + "��");

		if (average1 > average2) {
			System.out.println("1�б� ����� �� ����");
		} else if (average1 == average2) {
			System.out.println("����� ����");
		} else {
			System.out.println("2�б� ����� �� ����");
		}

		System.out.println("-----------------");

		int count = 0;
		for (int i = 0; i < score2.length; i++) {
			if (score1[i] != score2[i]) {
				System.out.println("������ �ٸ� ��ġ�� : " + i);
				count++;
			}
		}
		System.out.println("������ �ٸ� ���� ���� : " + count);

	}

}
