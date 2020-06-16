package 전달용클래스;

public class BoardDAO {

	public void insert(BoardDTO bag) {

		System.out.println();
		System.out.println("----------게시판 확인----------");
		System.out.println("번호 : " + bag.getNum());
		System.out.println("제목 : " + bag.getTitle());
		System.out.println("내용 : " + bag.getText());
		System.out.println("글쓴이 : " + bag.getName());

	}

}
