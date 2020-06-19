package 상속생성자;

public class QnABoard extends NormalBoard {

	String reply;

//	public QnABoard() {
////		super(); - 생략 가능
////		기본 생성자 호풀은 묵시적으로 가능
//	}
//
//	public QnABoard(String reply) {
//		super();
//		this.reply = reply;
//	}

	public QnABoard(int no, String title, String content, String writer, String reply) {
		// super클래스의 파라메터 생성자
		// 반드시 자식 클래스 생성자
		// 파라메터 있는 생성자는 생략 불가능
		super(no, title, content, writer);
		this.reply = reply;
	}

	@Override
	public String toString() {
		return "문의 게시판 답변 = " + reply + ", 번호 = " + no + ", 제목 = " + title + ", 내용 = " + content + ", 작가 = " + writer
				+ "]";
	}

}
