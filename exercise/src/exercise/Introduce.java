package exercise;

import java.util.Scanner;

public class Introduce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� �Է� >> ");
		String name = sc.next();
		System.out.println("����� �̸��� : " + name);

		System.out.print("���� �Է� >> ");
		int age = sc.nextInt();
		System.out.println("����� ���� ���̴� " + (age + 1));

		System.out.print("Ű �Է� >> ");
		double height = sc.nextDouble();
		System.out.println("����� Ű�� " + height);

		System.out.print("�λ� ��ǥ >> ");
		sc.nextLine();
		String goal = sc.nextLine();
		System.out.println("����� �λ� ��ǥ�� " + goal);

	}

}
