package exercise;

import java.util.Scanner;

public class DoWhileAdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size;

		do {
			System.out.print("How many numbers would you like to add?? ");
			size = sc.nextInt();
		} while (size <= 0);

		System.out.println("Enter the " + size + " numebers");

		int count = 0;
		int sum = 0;
		int num;

		while (count < size) {
			num = sc.nextInt();
			sum = num + sum;
			count++;
		}

		System.out.println("Sum : " + sum);

	}

}
