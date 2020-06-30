package bbs;

public class BbsBag {
	// 많은 양의 데이터를 가방에 넣어서 전달
	// 가방 역할의 클래스 - Data Transfer Object(DTO)
	// Value Object(VO)
	String id;
	String title;
	String content;
	String writer;

	// 가방에 넣을 때는 set 메소드
	// 가방에서 꺼낼 때는 get 메소드

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
