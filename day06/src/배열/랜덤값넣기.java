package �迭;

import java.util.Random;

public class �������ֱ� {

	public static void main(String[] args) {

		Random r = new Random(42);
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // 0~999
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		System.out.println("----------------------");
		// 1. �迭�� �ش� index�� ����ִ� ���� �����ͼ� ã�� ���� ��ġ�ϴ��� Ȯ��
		// 2. ��ġ�ϸ� �ش� index�� print
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 492) {
				System.out.println(i);
			}
		}
		
	}

}
