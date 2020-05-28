package 배열심화;

import java.util.Random;

public class 시험점수확인 {

	public static void main(String[] args) {

		int[] correct = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < correct.length; i++) {
			correct[i] = r.nextInt(4) + 1; // 1~4
		}
		for (int i = 0; i < correct.length; i++) {
			System.out.println(i+1 + "번: " + correct[i]);
		}
		
		System.out.println("--------------------");
		
		int[] student = correct.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int score = r.nextInt(4) + 1;
			student[index] = score;
			System.out.println(i+1 + "번: " + student[i]);
		}
		// 어떤 문항이 틀렸는지, 정답/답안 비교 print
		int no = 0;
		for (int i = 0; i < student.length; i++) {
			if (correct[i] != student[i]) {
				System.out.println(i + ": " + correct[i] + ", " + student[i]);
				no++;
			}
		}
		// 몇 개가 틀렸는지 찾아보기
		int ok = 1000 - no;
		System.out.println("틀린 갯수: " + no + "개");
		
		// 하나당 1점이라고 하면, 몇 점인지 print
		System.out.println("점수: " + ok + "점");
		
	}

}
