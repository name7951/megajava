package exercise;

import java.util.Random;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] answer = new int[45];
		Random r = new Random(42);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = r.nextInt(4) + 1;
		}

		int[] student = answer.clone();
		for (int i = 0; i < student.length; i++) {
			while (true) {
				System.out.print(i + 1 + "번 : ");
				student[i] = sc.nextInt();
				if (student[i] <= 4) {
					break;
				} else {
					System.out.println("잘못된 양식입니다");
					System.out.println("정답을 다시 입력해주세요");
				}
			}
		}
		
		System.out.println("---------");
		System.out.println("정답 확인");
		System.out.println("---------");
		
		int wrong = 0;
		for (int i = 0; i < answer.length; i++) {
			String correction;
			if (student[i] == answer[i]) {
				correction = "O";
			} else {
				correction = "X";
				wrong++;
			}
			System.out.println(i+1 + "번 : " + student[i] + " " + correction);
		}
		
		System.out.println("---------");
		System.out.println("정답 갯수 : " + (answer.length - wrong));
		

	}
}
