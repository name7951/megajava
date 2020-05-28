package 배열심화;

import java.util.Random;

public class FirstInPlace2 {

	public static void main(String[] args) {

		Random r = new Random(55); // 돌아갈 때마다 다른 숫자가 나오므로
									// 여기에는 진짜 아무 숫자가 들어가도 상관없음
									// 몇 번을 돌려도 랜덤한 값이 일정하게 나옴
		int[] score = new int[10000]; // 인원 수
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(401); // 0~400 까지의 범위
		}

		// 각 index의 값 비교 -> 최댓값 찾기
		int max = score[0];
		// 전체 점수를 돌면서 (for)
		// 조건 확인: 최고 변수 max에 넣어둔 값보다 큰지 확인
		// 처리: 크다면 그 index까지의 최고값이 되는 것 -> max에 해당값을 대입
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.println("최고값은 " + max);
		
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			if (max == score[i]) {
				System.out.println("최고 점수를 받은 학생은 " + i);
				count++;
			}
		}
		
		System.out.println("인원은 " + count + "명");
		
	}

}
