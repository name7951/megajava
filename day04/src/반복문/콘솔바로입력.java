package �ݺ���;

import java.util.Scanner;

public class �ֹܼٷ��Է� {

	public static void main(String[] args) {
		// Scanner (�Է�, file, Ű����, ��Ʈ��ũ ......)
		// String�� Int�� �ٲ��ִ� ��ɾ ����������

		System.out.print("���̸� �Է��ϼ��� >> ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); // �Է¹��� ���� Int�� �ٲ���
		
		System.out.println("����� ���̴� " + age);
		System.out.println("����� ���� ���̴� " + (age+1));

				
	}

}
