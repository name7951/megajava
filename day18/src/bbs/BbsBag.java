package bbs;

public class BbsBag {
	// ���� ���� �����͸� ���濡 �־ ����
	// ���� ������ Ŭ���� - Data Transfer Object(DTO)
	// Value Object(VO)
	String id;
	String title;
	String content;
	String writer;

	// ���濡 ���� ���� set �޼ҵ�
	// ���濡�� ���� ���� get �޼ҵ�

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
