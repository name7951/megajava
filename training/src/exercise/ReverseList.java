package exercise;

import java.util.Scanner;

public class ReverseList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[10];
		System.out.print("Enter 10 integers : ");
		
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		System.out.print("List in reverse: " );
		for (int i = list.length - 1 ; i >= 0; i--) {
			System.out.println(list[i] + " ");
		}
		
	}

}
