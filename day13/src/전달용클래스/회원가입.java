package ���޿�Ŭ����;

import java.util.Scanner;

public class ȸ������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("����� ID�� �Է��ϼ��� : ");
		String id = sc.next();
		System.out.print("����� ��й�ȣ���� �Է��ϼ��� : ");
		String pw = sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
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
