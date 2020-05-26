package 배열;

import java.util.Scanner;

public class 값을모르는경우3 {

	public static void main(String[] args) {
		// 키보드로 콘솔에서 입력받을 수 있는 부품
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("숫자 입력>> ");
			data[i] = sc.nextInt(); // String -> int
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " " );
		}
		
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		
		System.out.println();
		System.out.println("총 합: " + sum); 
		System.out.println("평균 : " + ((double)sum/data.length));
		
	}

}
