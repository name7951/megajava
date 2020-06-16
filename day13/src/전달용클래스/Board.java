package 전달용클래스;

import java.util.Scanner;

public class Board {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------게시판----------");		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("제목 : ");
		String title = sc.next();
		System.out.print("내용 : ");
		String text = sc.next();
		System.out.print("글쓴이 : ");
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
