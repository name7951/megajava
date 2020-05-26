package exercise;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		String[] name = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
		}
		System.out.println("**" + name[0] + "º¸´Ù´Â " + name[1] + "**");
		
	}

}
