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
				System.out.print(i + 1 + "�� : ");
				student[i] = sc.nextInt();
				if (student[i] <= 4) {
					break;
				} else {
					System.out.println("�߸��� ����Դϴ�");
					System.out.println("������ �ٽ� �Է����ּ���");
				}
			}
		}
		
		System.out.println("---------");
		System.out.println("���� Ȯ��");
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
			System.out.println(i+1 + "�� : " + student[i] + " " + correction);
		}
		
		System.out.println("---------");
		System.out.println("���� ���� : " + (answer.length - wrong));
		

	}
}
