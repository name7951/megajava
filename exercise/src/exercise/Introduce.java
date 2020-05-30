package exercise;

import java.util.Scanner;

public class Introduce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.println("당신의 이름은 : " + name);

		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.println("당신의 내년 나이는 " + (age + 1));

		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		System.out.println("당신의 키는 " + height);

		System.out.print("인생 목표 >> ");
		sc.nextLine();
		String goal = sc.nextLine();
		System.out.println("당신의 인생 목표는 " + goal);

	}

}
