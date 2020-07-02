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

		// 2. dbó��
		DAOInterface dao = new DAOInterface() {

			@Override
			public void create(String id, String pw) {
				System.out.println(id + ", " + pw + "�� ���� �Ϸ�");
			}

			@Override
			public void read(String id) {
				System.out.println(id + "�� ������ ��й�ȣ��  " + pw + "�Դϴ�");
			}

			@Override
			public void update(String id, String pw) {
				System.out.println(id + "�� ��й�ȣ�� " + pw + "�� ����Ǿ����ϴ�");
			}

			@Override
			public void delete(String id) {
				System.out.println(id + "�� �����Ǿ����ϴ�");
			}

		};

		dao.create(id, pw);
		dao.read(id);
		dao.update(id, pw);
		dao.delete(id);

	}

}
