package exercise;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int total = 0;
		int price = 10000;

		while (true) {
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.print("원하시는 좌석번호를 입력하세요 (종료는 -1) : ");
			int num = sc.nextInt();

			if (num == -1) {
				System.out.println("시스템을 종료합니다");
				System.out.println("예매한 자리 수 : " + total + "매");
				System.out.println("결제할 금액 : " + (total * price) + "원");
				break;
			}
			if (seat[num - 1] == 1) {
				System.out.println("이미 예매된 자리입니다");
				System.out.println("다른 자리를 선택해주세요");
			} else {
				seat[num - 1] = 1;
				System.out.println("예매되었습니다");
				System.out.println("자리를 확인해주세요");
				total++;
			}
		}

	}

}
