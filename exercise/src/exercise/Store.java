package exercise;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���汸");
		System.out.println("���Կ� �ִ� ��ǰ�� : ��ƼĿ, ��Ʈ");
		
		int price1 = 3000;
		int price2 = 5000;
		double total1, total2 = 0;
		
		System.out.print("������ ��ƼĿ ���� : ");
		int num1 = sc.nextInt();
		System.out.print("������ ��Ʈ ���� : ");
		int num2 = sc.nextInt();
		
		total1 = num1*price1;
		total2 = num2*price2;
		System.out.println("��ƼĿ �� ���� : " + total1 + "��");
		System.out.println("��Ʈ �� ���� : " + total2 + "��");
		System.out.println("------------------------------");
		
		double total = 0;
		total = total1 + total2;
		if (total >= 25000) {
			total = total * 0.7;
		} else {
			total = total;
		}
		System.out.println("�� ���� �ݾ� :" + total + "��");
		
	}

}
