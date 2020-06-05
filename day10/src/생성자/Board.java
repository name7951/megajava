package »ı¼ºÀÚ;

public class Board {

	int num;
	String title;
	String content;
	String wirter;

	public Board(int num, String title, String content, String wirter) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.wirter = wirter;
	}

	@Override
	public String toString() {
		return "Board num=" + num + ", title=" + title + ", content=" + content + ", wirter=" + wirter + "";
	}

}
