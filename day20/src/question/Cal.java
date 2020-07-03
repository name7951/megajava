package question;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();

		int add = num1 + num2;
		int minus = num1 - num2;
		int mul = num1 * num2;
		double div = num1 / num2;

		System.out.println("-------------------");
		System.out.println("더하기 결과 : " + add);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 결과 : " + div);

	}

}
