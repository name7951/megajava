package exercise;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		int[] num = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է� >> ");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
