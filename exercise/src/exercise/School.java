package exercise;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] student = { "ö��", "����", "�̾�" };
		int[] score = new int[3];

		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л� �� || 2.�����Է� || 3.��������Ʈ || 4.�м� || 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("���� >> ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("�л��� : " + student.length);
			} else if (num == 2) {
				System.out.print("ö�� : ");
				score[0] = sc.nextInt();
				System.out.print("���� : ");
				score[1] = sc.nextInt();
				System.out.print("�̾� : ");
				score[2] = sc.nextInt();
			} else if (num == 3) {

				if (score[0] == 0) {
					System.out.println("������ �Է����ּ���");
				} else if (score[1] == 0) {
					System.out.println("������ �Է����ּ���");
				} else if (score[2] == 0) {
					System.out.println("������ �Է����ּ���");
				} else {
					System.out.println("ö���� ���� : " + score[0]);
					System.out.println("������ ���� : " + score[1]);
					System.out.println("�̾��� ���� : " + score[2]);
				}
			} else if (num == 4) {
				int highscore;
				if (score[0] == 0) {
					System.out.println("������ �Է����ּ���");
				} else if (score[1] == 0) {
					System.out.println("������ �Է����ּ���");
				} else if (score[2] == 0) {
					System.out.println("������ �Է����ּ���");
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
					System.out.println("�ְ� ���� : " + highscore + "��");
					int sum = 0;
					for (int i = 0; i < score.length; i++) {
						sum = sum + score[i];
					}
					double average = (double) sum / score.length;
					System.out.println("��� ���� : " + average);
				}
			} else if (num == 5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else {
				System.out.println("�ٽ� �õ����ּ���");
			}

		}
	}
}