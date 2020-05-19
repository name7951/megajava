package 순차문;

import javax.swing.JOptionPane;

public class 성인판별 {

	public static void main(String[] args) {

		//이름을 입력해서 출력
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		
		String age = JOptionPane.showInputDialog("나이를 입력하세요");
		int age2 = Integer.parseInt(age); // 분석해보고 괜찮으면 int로 변환

		//조건문
		if (age2 >= 18) {
			JOptionPane.showMessageDialog(null, name + "님은 성인입니다");
		} else {
			JOptionPane.showMessageDialog(null, name + "님은 미성년자입니다");
		}
		
	}

}
