package exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		int balance = 10000;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("���� >> ");
			
			int choice = sc.nextInt();
			
			if (choice == 1) { // ����
				System.out.print("���ݾ� >> ");
				int input = sc.nextInt();
				balance = balance + input;
				System.out.println("�ܰ� : " + balance);
				
			} else if (choice == 2) {
				System.out.print("��ݾ� >> ");
				int output = sc.nextInt();
				balance = balance - output;
				System.out.println("�ܰ� : " + balance);
						
			} else if (choice == 3) {
				System.out.println("�ܰ� >> " + balance);
				
			} else if (choice == 4) {
				// ���α׷� ����
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
				
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
				
			}
		}
		
	}

