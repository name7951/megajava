package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class FirstInPlace {

	public static void main(String[] args) {

		Random r = new Random(55); // 
		int[] score = new int[10000]; // �ο� ��
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(401); // 0~400 ������ ����
		}
		// �ı��� �Լ�
		Arrays.sort(score);
		
		for (int x : score) {
			System.out.println(x);
		}
		System.out.println("�ְ� ������ " + score[9999] + "��");
		
	}

}
