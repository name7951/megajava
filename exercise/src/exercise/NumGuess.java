package exercise;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(51);
		
		while (true) {
			System.out.print("숫자를 입력하세요 >> ");
			int guess = sc.nextInt();
			if (answer == guess) {
				System.out.println("정답입니다");
				break;
			} else {
				if (answer > guess) {
					System.out.println("UP");
				} else {
					System.out.println("DONW");
				}
			}
		}
		
	}

}
