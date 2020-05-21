package 반복문;

import java.util.Scanner;

public class 콘솔Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 과목을 입력하세요 >> ");
		String data = sc.next(); // 한 단어
		
		switch (data) {
		case "자바":
			System.out.println("JSP로 점프");
			break;
		case "파이썬":
			System.out.println("장고로 점프");
			break;
		default:
			System.out.println("무조건 열심히");
			break;
		}
		
	}

}
