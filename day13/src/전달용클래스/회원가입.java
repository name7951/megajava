package 전달용클래스;

import java.util.Scanner;

public class 회원가입 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("사용할 ID를 입력하세요 : ");
		String id = sc.next();
		System.out.print("사용할 비밀번호를를 입력하세요 : ");
		String pw = sc.next();
		System.out.print("성함을 입력하세요 : ");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요 : ");
		String tel = sc.next();

		MemberDAO dao = new MemberDAO();

		MemberDTO bag = new MemberDTO();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);

		dao.insert(bag);

	}

}
