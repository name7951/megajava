package question;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();

		int add = num1 + num2;
		int minus = num1 - num2;
		int mul = num1 * num2;
		double div = num1 / num2;

		System.out.println("-------------------");
		System.out.println("���ϱ� ��� : " + add);
		System.out.println("���� ��� : " + minus);
		System.out.println("���ϱ� ��� : " + mul);
		System.out.println("������ ��� : " + div);

	}

}
