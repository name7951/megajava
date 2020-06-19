package 상속생성자;

// base import : import java.lang.*
public class NormalBoard { // extends Object - 모든 클래스는 Object을 상속

	int no;
	String title;
	String content;
	String writer;

	public NormalBoard() {
	}
	
	public NormalBoard(int no, String title, String content, String writer) {
//		super(); - 생략 가능
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "게시판 번호 = " + no + ", 제목 = " + title + ", 내용 = " + content + ", 글쓴이 = " + writer + "]";
	}

}
