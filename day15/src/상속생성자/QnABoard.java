package ��ӻ�����;

public class QnABoard extends NormalBoard {

	String reply;

//	public QnABoard() {
////		super(); - ���� ����
////		�⺻ ������ ȣǮ�� ���������� ����
//	}
//
//	public QnABoard(String reply) {
//		super();
//		this.reply = reply;
//	}

	public QnABoard(int no, String title, String content, String writer, String reply) {
		// superŬ������ �Ķ���� ������
		// �ݵ�� �ڽ� Ŭ���� ������
		// �Ķ���� �ִ� �����ڴ� ���� �Ұ���
		super(no, title, content, writer);
		this.reply = reply;
	}

	@Override
	public String toString() {
		return "���� �Խ��� �亯 = " + reply + ", ��ȣ = " + no + ", ���� = " + title + ", ���� = " + content + ", �۰� = " + writer
				+ "]";
	}

}
