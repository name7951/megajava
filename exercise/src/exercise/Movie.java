package exercise;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int total = 0;
		int price = 10000;

		while (true) {
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ��� (����� -1) : ");
			int num = sc.nextInt();

			if (num == -1) {
				System.out.println("�ý����� �����մϴ�");
				System.out.println("������ �ڸ� �� : " + total + "��");
				System.out.println("������ �ݾ� : " + (total * price) + "��");
				break;
			}
			if (seat[num - 1] == 1) {
				System.out.println("�̹� ���ŵ� �ڸ��Դϴ�");
				System.out.println("�ٸ� �ڸ��� �������ּ���");
			} else {
				seat[num - 1] = 1;
				System.out.println("���ŵǾ����ϴ�");
				System.out.println("�ڸ��� Ȯ�����ּ���");
				total++;
			}
		}

	}

}
