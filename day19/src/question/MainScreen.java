package question;

import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1. create
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();

		// 2. db처리
		DAOInterface dao = new DAOInterface() {

			@Override
			public void create(String id, String pw) {
				System.out.println(id + ", " + pw + "로 가입 완료");
			}

			@Override
			public void read(String id) {
				System.out.println(id + "의 정보는 비밀번호가  " + pw + "입니다");
			}

			@Override
			public void update(String id, String pw) {
				System.out.println(id + "의 비밀번호가 " + pw + "로 변경되었습니다");
			}

			@Override
			public void delete(String id) {
				System.out.println(id + "가 삭제되었습니다");
			}

		};

		dao.create(id, pw);
		dao.read(id);
		dao.update(id, pw);
		dao.delete(id);

	}

}
