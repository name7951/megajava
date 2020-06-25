package exercise;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int[] digits = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int answer;

		System.out.println("구구단 프로그램");
		while (true) {
			System.out.print("몇 단을 하실 건가요?? ");
			num = sc.nextInt();
			for (int i = 0; i < digits.length; i++) {
				System.out.println(num * digits[i] + " ");
			}

			System.out.print("계속하시러면 1, 그만두려면 0을 눌러주세요 >> ");
			answer = sc.nextInt();
			if (answer == 1) {
				System.out.println("");
			} else if (answer == 0) {
				System.out.println("감사합니다");
				break;
			}

		}

	}

}
