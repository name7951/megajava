package ���޿�Ŭ����;

import java.util.Scanner;

public class Board {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------�Խ���----------");		
		System.out.print("��ȣ : ");
		int num = sc.nextInt();
		System.out.print("���� : ");
		String title = sc.next();
		System.out.print("���� : ");
		String text = sc.next();
		System.out.print("�۾��� : ");
		String name = sc.next();

		BoardDAO dao = new BoardDAO();

		BoardDTO bag = new BoardDTO();
		bag.setNum(num);
		bag.setTitle(title);
		bag.setText(text);
		bag.setName(name);

		dao.insert(bag);

	}

}
