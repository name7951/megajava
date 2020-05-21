package 반복문;

import java.util.Scanner;

public class 콘솔바로입력 {

	public static void main(String[] args) {
		// Scanner (입력, file, 키보드, 네트워크 ......)
		// String을 Int로 바꿔주는 명령어를 가지고있음

		System.out.print("나이를 입력하세요 >> ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); // 입력받은 값을 Int로 바꿔줌
		
		System.out.println("당신의 나이는 " + age);
		System.out.println("당신의 내년 나이는 " + (age+1));

				
	}

}
