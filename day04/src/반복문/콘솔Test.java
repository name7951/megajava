package �ݺ���;

import java.util.Scanner;

public class �ܼ�Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� >> ");
		int n1 = sc.nextInt();
		System.out.print("�ι�° ���� >> ");
		int n2 = sc.nextInt();
				
				
		if (n1 > n2) {
			System.out.println("ù��° ���ڰ� �� ũ��");
		} else if (n1 < n2) {
			System.out.println("�ι�° ���ڰ� �� ũ��");
		} else {
			System.out.println("�� ���ڰ� ����");
			
		}
			
	}

}
