package ���޿�Ŭ����;

// Data Access Object(DAO)
// ������ ���̽� ó�� Ŭ����
public class MemberDAO {
	// db�� �ִ� ó�� ����
	public void insert(MemberDTO bag) {
		// db ����, ����
		System.out.println();
		System.out.println("db�� ����");
		System.out.println("����� id : " + bag.getId());
		System.out.println("����� ��й�ȣ : " + bag.getPw());
		System.out.println("����� �̸� : " + bag.getName());
		System.out.println("����� ��ȭ��ȣ : " + bag.getTel());
		
		System.out.println("db�� ����");

	}

}
