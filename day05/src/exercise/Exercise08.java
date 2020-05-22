package exercise;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		int IU = 0;
		int TW = 0;
		int BTS =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("1.아이유 | 2.트와이스 | 3.방탄소년단 | 4.종료");
		System.out.println("---------------------------------");
		
		while(true) {
			System.out.print("선택할 사람/그룹의 번호를 입력하세요 >> ");
			
			int choice = sc.nextInt();
			
			if (choice == 1) { // 예금
				//IU = IU + 1;
				IU++;
			} else if (choice == 2) {
				TW = TW + 1;
			} else if (choice == 3) {
				BTS = BTS + 1;
			} else if (choice == 4) {
				// 프로그램 종료
				System.out.println("-----------------------------");
				System.out.println("총 득표 수");
				System.out.println("아이유 : " + IU + "표");
				System.out.println("트와이스 : " + TW + "표");
				System.out.println("방탄소년단 : " + BTS + "표");
				System.out.println();
				System.out.println("시스템을 종료합니다");
				System.exit(0);
				
			} else {
				System.out.println("다시 입력해주세요");
			}
				
			}
		}
		
	}

