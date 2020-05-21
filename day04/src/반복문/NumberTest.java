package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class NumberTest {

	public static void main(String[] args) {

		Random r =new Random();
		int count = 0;
		
		while(true) {
			String exit = JOptionPane.showInputDialog("종료: X   계속: 아무 키나 누르세요");
			if (exit.equals("X")) {
				System.out.println("시스템 종료");
				System.out.println(count + "회 시도");
				break;
			}
			count++;
			
			int first = r.nextInt(100);
			int second = r.nextInt(100);
			
			if (first > second) {
				System.out.println(count + ". 첫번째 숫자가 두번째 숫자보다 크다");
				System.out.print(first + " ");
				System.out.println(second);
			} else if (first == second) {
				System.out.println(count + ". 두 숫자가 같다");
				System.out.print(first + " ");
				System.out.println(second);
			} else {
				System.out.println(count +". 두번째 숫자가 첫번째 숫자보다 크다");
				System.out.print(first + " ");
				System.out.println(second);
			}
			
			}
		
	}
}
