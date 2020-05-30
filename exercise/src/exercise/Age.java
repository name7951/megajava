package exercise;

import javax.swing.JOptionPane;

public class Age {

	public static void main(String[] args) {

		String[] age = new String[4];
		int sum = 0;

		for (int i = 0; i < age.length; i++) {
			age[i] = JOptionPane.showInputDialog("나이를 입력하세요");
			sum = sum + Integer.parseInt(age[i]);
		}

		System.out.println("가족 나이의 평균은 " + ((double) sum / age.length) + "세입니다");

	}

}
