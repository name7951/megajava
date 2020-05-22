package exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		int balance = 10000;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택 >> ");
			
			int choice = sc.nextInt();
			
			if (choice == 1) { // 예금
				System.out.print("예금액 >> ");
				int input = sc.nextInt();
				balance = balance + input;
				System.out.println("잔고 : " + balance);
				
			} else if (choice == 2) {
				System.out.print("출금액 >> ");
				int output = sc.nextInt();
				balance = balance - output;
				System.out.println("잔고 : " + balance);
						
			} else if (choice == 3) {
				System.out.println("잔고 >> " + balance);
				
			} else if (choice == 4) {
				// 프로그램 종료
				System.out.println("시스템을 종료합니다");
				System.exit(0);
				
			} else {
				System.out.println("다시 입력해주세요");
			}
				
			}
		}
		
	}

