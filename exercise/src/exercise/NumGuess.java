package exercise;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(51);
		
		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� >> ");
			int guess = sc.nextInt();
			if (answer == guess) {
				System.out.println("�����Դϴ�");
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
