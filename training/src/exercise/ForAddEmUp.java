package exercise;

import java.util.Scanner;

public class ForAddEmUp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int size;
		int number;
		
		System.out.print("How many numbers would you like to add? >> ");
		size = sc.nextInt();
		
		System.out.println("Enter " + size + "numbers");
		
		for (int i = 0; i < size; i++) {
			number = sc.nextInt();
			sum = sum + number;
		}
		
		System.out.println("Sum : " + sum);
		
	}

}
