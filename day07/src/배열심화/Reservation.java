package �迭��ȭ;

import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		// ���Ű� �� �ڸ��� 1�� ����
		Scanner sc = new Scanner(System.in);
		
		int[] seat = new int[10];
		int total = 0;
		
		while (true) {
			System.out.println("==============================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.println("==============================");
			System.out.print("���Ͻô� �¼��� ��ȣ�� �Է��ϼ��� (���� : -1) >> ");
			int num = sc.nextInt();
			
			if (num == -1) {
				System.out.println("�����մϴ�");
				System.out.println("������ �¼� �� : " + total + "�ڸ�");
				System.out.println("�� �ݾ� : " + (10000 * total) + "��");
				break; // �ݺ��� ����
			}
			
			// �����ϱ� ���� �� �ڸ��� �̹� ���� �� �ڸ����� Ȯ���ϴ� ���� �ʿ�
			if (seat[num -1] == 1) { // ���� �� �ڸ�
				System.out.println("�̹� ���� �� �ڸ��Դϴ�");
				System.out.println("�ٸ� �¼��� �������ּ���");
			} else {
				// ���� ó��
				seat[num - 1] = 1;
				System.out.println("���ŵǾ����ϴ�");
				System.out.println("�ڸ��� Ȯ�����ּ���");
				total++;
			}
			
		}
		
		
	}

}
