package exercise;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {

		int money = 10000; // ���� ������ �ִ� ��
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------");
			System.out.println("1.���� || 2.��� || 3.�ܰ� || 4.����");
			System.out.println("------------------------------");
			System.out.print("���� > ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("���ݾ� : ");
				int input = sc.nextInt();
				money = money + input;
			} else if (num == 2) {
				System.out.println("��ݾ� : ");
				int output = sc.nextInt();
				money = money - output;
			} else if (num == 3) {
				System.out.println("�ܰ� : " + money + "��");
			} else if (num == 4) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else {
				System.out.println("�ٽ� �õ����ּ���");
			} 
		}
		
	}

}
