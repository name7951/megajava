package �迭��ȭ;

import java.util.Random;

public class ��������Ȯ�� {

	public static void main(String[] args) {

		int[] correct = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < correct.length; i++) {
			correct[i] = r.nextInt(4) + 1; // 1~4
		}
		for (int i = 0; i < correct.length; i++) {
			System.out.println(i+1 + "��: " + correct[i]);
		}
		
		System.out.println("--------------------");
		
		int[] student = correct.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int score = r.nextInt(4) + 1;
			student[index] = score;
			System.out.println(i+1 + "��: " + student[i]);
		}
		// � ������ Ʋ�ȴ���, ����/��� �� print
		int no = 0;
		for (int i = 0; i < student.length; i++) {
			if (correct[i] != student[i]) {
				System.out.println(i + ": " + correct[i] + ", " + student[i]);
				no++;
			}
		}
		// �� ���� Ʋ�ȴ��� ã�ƺ���
		int ok = 1000 - no;
		System.out.println("Ʋ�� ����: " + no + "��");
		
		// �ϳ��� 1���̶�� �ϸ�, �� ������ print
		System.out.println("����: " + ok + "��");
		
	}

}
