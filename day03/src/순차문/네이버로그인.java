package 순차문;

import javax.swing.JOptionPane;

public class 네이버로그인 {

	public static void main(String[] args) {

		String id = "root"; // 회원가입 할 때의 id
		String id2 = JOptionPane.showInputDialog("ID를 입력하세요");
		
		String pw = "abcd";
		String pw2 = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 되었습니다");
		} else {
			System.out.println("다시 시도해주세요");
		}
		
	}

}
