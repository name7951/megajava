package �迭��ȭ;

import java.util.Random;

public class FirstInPlace2 {

	public static void main(String[] args) {

		Random r = new Random(55); // ���ư� ������ �ٸ� ���ڰ� �����Ƿ�
									// ���⿡�� ��¥ �ƹ� ���ڰ� ���� �������
									// �� ���� ������ ������ ���� �����ϰ� ����
		int[] score = new int[10000]; // �ο� ��
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(401); // 0~400 ������ ����
		}

		// �� index�� �� �� -> �ִ� ã��
		int max = score[0];
		// ��ü ������ ���鼭 (for)
		// ���� Ȯ��: �ְ� ���� max�� �־�� ������ ū�� Ȯ��
		// ó��: ũ�ٸ� �� index������ �ְ��� �Ǵ� �� -> max�� �ش簪�� ����
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.println("�ְ��� " + max);
		
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			if (max == score[i]) {
				System.out.println("�ְ� ������ ���� �л��� " + i);
				count++;
			}
		}
		
		System.out.println("�ο��� " + count + "��");
		
	}

}
