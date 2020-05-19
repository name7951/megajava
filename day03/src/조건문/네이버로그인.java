package 조건문;

public class 네이버로그인 {

	public static void main(String[] args) {

		String id = "root"; // 회원가입 할 때의 id
		String id2 = "admin"; // 입력한 id
		
		String pw = "abcd";
		String pw2 = "abcd";
				
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 되었습니다");
		} else {
			System.out.println("다시 시도해주세요");
		}
		
	}

}
