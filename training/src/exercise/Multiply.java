package exercise;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int[] digits = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int answer;

		System.out.println("������ ���α׷�");
		while (true) {
			System.out.print("�� ���� �Ͻ� �ǰ���?? ");
			num = sc.nextInt();
			for (int i = 0; i < digits.length; i++) {
				System.out.println(num * digits[i] + " ");
			}

			System.out.print("����Ͻ÷��� 1, �׸��η��� 0�� �����ּ��� >> ");
			answer = sc.nextInt();
			if (answer == 1) {
				System.out.println("");
			} else if (answer == 0) {
				System.out.println("�����մϴ�");
				break;
			}

		}

	}

}
