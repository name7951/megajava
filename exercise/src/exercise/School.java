package exercise;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] student = { "철수", "영희", "미애" };
		int[] score = new int[3];

		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생 수 || 2.점수입력 || 3.점수리스트 || 4.분석 || 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 >> ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("학생수 : " + student.length);
			} else if (num == 2) {
				System.out.print("철수 : ");
				score[0] = sc.nextInt();
				System.out.print("영희 : ");
				score[1] = sc.nextInt();
				System.out.print("미애 : ");
				score[2] = sc.nextInt();
			} else if (num == 3) {

				if (score[0] == 0) {
					System.out.println("점수를 입력해주세요");
				} else if (score[1] == 0) {
					System.out.println("점수를 입력해주세요");
				} else if (score[2] == 0) {
					System.out.println("점수를 입력해주세요");
				} else {
					System.out.println("철수의 점수 : " + score[0]);
					System.out.println("영희의 점수 : " + score[1]);
					System.out.println("미애의 점수 : " + score[2]);
				}
			} else if (num == 4) {
				int highscore;
				if (score[0] == 0) {
					System.out.println("점수를 입력해주세요");
				} else if (score[1] == 0) {
					System.out.println("점수를 입력해주세요");
				} else if (score[2] == 0) {
					System.out.println("점수를 입력해주세요");
				} else {
					if (score[0] >= score[1]) {
						highscore = score[0];
					} else {
						highscore = score[1];
					}
					if (highscore >= score[2]) {
						highscore = highscore;
					} else {
						highscore = score[2];
					}
					System.out.println("최고 점수 : " + highscore + "점");
					int sum = 0;
					for (int i = 0; i < score.length; i++) {
						sum = sum + score[i];
					}
					double average = (double) sum / score.length;
					System.out.println("평균 점수 : " + average);
				}
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("다시 시도해주세요");
			}

		}
	}
}