package 배열심화;

import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		// 예매가 된 자리는 1로 변경
		Scanner sc = new Scanner(System.in);
		
		int[] seat = new int[10];
		int total = 0;
		
		while (true) {
			System.out.println("==============================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.println("==============================");
			System.out.print("원하시는 좌석의 번호를 입력하세요 (종료 : -1) >> ");
			int num = sc.nextInt();
			
			if (num == -1) {
				System.out.println("종료합니다");
				System.out.println("예약한 좌석 수 : " + total + "자리");
				System.out.println("총 금액 : " + (10000 * total) + "원");
				break; // 반복문 종료
			}
			
			// 예매하기 전에 그 자리가 이미 예매 된 자리인지 확인하는 절차 필요
			if (seat[num -1] == 1) { // 예매 된 자리
				System.out.println("이미 예매 된 자리입니다");
				System.out.println("다른 좌석을 선택해주세요");
			} else {
				// 예매 처리
				seat[num - 1] = 1;
				System.out.println("예매되었습니다");
				System.out.println("자리를 확인해주세요");
				total++;
			}
			
		}
		
		
	}

}
