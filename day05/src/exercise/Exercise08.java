package exercise;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		int IU = 0;
		int TW = 0;
		int BTS =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("1.������ | 2.Ʈ���̽� | 3.��ź�ҳ�� | 4.����");
		System.out.println("---------------------------------");
		
		while(true) {
			System.out.print("������ ���/�׷��� ��ȣ�� �Է��ϼ��� >> ");
			
			int choice = sc.nextInt();
			
			if (choice == 1) { // ����
				//IU = IU + 1;
				IU++;
			} else if (choice == 2) {
				TW = TW + 1;
			} else if (choice == 3) {
				BTS = BTS + 1;
			} else if (choice == 4) {
				// ���α׷� ����
				System.out.println("-----------------------------");
				System.out.println("�� ��ǥ ��");
				System.out.println("������ : " + IU + "ǥ");
				System.out.println("Ʈ���̽� : " + TW + "ǥ");
				System.out.println("��ź�ҳ�� : " + BTS + "ǥ");
				System.out.println();
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
				
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
				
			}
		}
		
	}

