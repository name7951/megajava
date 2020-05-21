package 반복문;

import java.util.Scanner;

public class 콘솔Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 >> ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자 >> ");
		int n2 = sc.nextInt();
				
				
		if (n1 > n2) {
			System.out.println("첫번째 숫자가 더 크다");
		} else if (n1 < n2) {
			System.out.println("두번째 숫자가 더 크다");
		} else {
			System.out.println("두 숫자가 같다");
			
		}
			
	}

}
