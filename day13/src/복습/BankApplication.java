package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList(); // ���¸�� ����

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------");
			System.out.print("���� >> ");
			int num = sc.nextInt();

			if (num == 5) {
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
			if (num == 1) { // ���»��� �� list�� �߰�
				System.out.println("=========");
				System.out.println("���� ����");
				System.out.println("=========");

				System.out.print("���¹�ȣ : ");
				String digits = sc.next();
				System.out.print("������ : ");
				String name = sc.next();
				System.out.print("�ʱ��Աݾ� : ");
				int firstInput = sc.nextInt();

				Account a = new Account(digits, name, firstInput);

				list.add(a);

			} else if (num == 2) { // ���¸��

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

			} else if (num == 3) {

				System.out.println("=========");
				System.out.println("����");
				System.out.println("=========");

				System.out.print("���¹�ȣ : ");
				String digits = sc.next();
				int index = 0; // list���� �ε���

				for (int i = 0; i < list.size(); i++) {
					Account a = (Account) list.get(i);
					if (a.digits.equals(digits)) {
						index = i;
					}
				}

				Account a = (Account) list.get(index);
				System.out.print("�Աݾ� : ");
				int input = sc.nextInt();
				a.firstInput = a.firstInput + input;

				System.out.println("������ �Ϸ�Ǿ����ϴ�");

			} else if (num == 4) {

				System.out.println("=========");
				System.out.println("���");
				System.out.println("=========");

				System.out.print("���¹�ȣ : ");
				String digits = sc.next(); // 1�� ����

				int index = 0; // list���� �ε���

				for (int i = 0; i < list.size(); i++) {
					Account a = (Account) list.get(i);
					if (a.digits.equals(digits)) {
						index = i;
					}
				}

				Account a = (Account) list.get(index);
				System.out.print("��ݾ� : ");
				int input = sc.nextInt();
				a.firstInput = a.firstInput - input;

				System.out.println("����� �Ϸ�Ǿ����ϴ�");

			} else {
				System.out.println("�ٽ� �õ����ּ���");
			}

		} // while end

	} // main end

} // class end
