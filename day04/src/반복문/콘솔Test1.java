package �ݺ���;

import java.util.Scanner;

public class �ܼ�Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϴ� ������ �Է��ϼ��� >> ");
		String data = sc.next(); // �� �ܾ�
		
		switch (data) {
		case "�ڹ�":
			System.out.println("JSP�� ����");
			break;
		case "���̽�":
			System.out.println("���� ����");
			break;
		default:
			System.out.println("������ ������");
			break;
		}
		
	}

}
