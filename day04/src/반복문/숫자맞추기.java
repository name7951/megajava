package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기 {

	public static void main(String[] args) {

		// 아무 값이나 만들어주는 class
		Random r = new Random();

		int target = r.nextInt(100); // 정수 범위에서 랜덤한 숫자 (0~99) 
		int count = 0;

		while(true) {
			
			String data = JOptionPane.showInputDialog("숫자를 입력하세요");
			count++;
			
			int guess = Integer.parseInt(data);
			
			if (target == guess) {
				System.out.println(guess + " 정답입니다");
				System.out.println("시도 횟수: " + count);
				System.out.println("시스템을 종료합니다");
				break;
			} else {
				System.out.println(guess+ " 오답입니다");
				// 입력한 값이 정답보다 큰지 작은지 힌트
				if (target > guess) {
					System.out.println("UP");
				} else {
					System.out.println("DOWN");
				}
			}
		}
		
			
	}

}
