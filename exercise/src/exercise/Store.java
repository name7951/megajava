package exercise;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문방구");
		System.out.println("가게에 있는 물품들 : 스티커, 노트");
		
		int price1 = 3000;
		int price2 = 5000;
		double total1, total2 = 0;
		
		System.out.print("구입할 스티커 갯수 : ");
		int num1 = sc.nextInt();
		System.out.print("구입할 노트 갯수 : ");
		int num2 = sc.nextInt();
		
		total1 = num1*price1;
		total2 = num2*price2;
		System.out.println("스티커 총 가격 : " + total1 + "원");
		System.out.println("노트 총 가격 : " + total2 + "원");
		System.out.println("------------------------------");
		
		double total = 0;
		total = total1 + total2;
		if (total >= 25000) {
			total = total * 0.7;
		} else {
			total = total;
		}
		System.out.println("총 결제 금액 :" + total + "원");
		
	}

}
