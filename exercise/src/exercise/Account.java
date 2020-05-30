package exercise;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {

		int money = 10000; // 현재 가지고 있는 돈
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 || 2.출금 || 3.잔고 || 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("예금액 : ");
				int input = sc.nextInt();
				money = money + input;
			} else if (num == 2) {
				System.out.println("출금액 : ");
				int output = sc.nextInt();
				money = money - output;
			} else if (num == 3) {
				System.out.println("잔고 : " + money + "원");
			} else if (num == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("다시 시도해주세요");
			} 
		}
		
	}

}
