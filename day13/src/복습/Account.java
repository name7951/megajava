package ����;

public class Account {

	String name; // ������
	String digits; // ���¹�ȣ
	int firstInput; // �ʱ��Աݾ�

	// ��ü ������ �ڵ����� ȣ��Ǵ� �޼ҵ� - ������ �޼ҵ�
	// �Է°��� ���� �޼ҵ� ȣ��
	// �Ķ���Ͱ� �ִ� �����ڸ� ����� ��ü ������ �ݵ�� �ʿ��� �׸�� ���� ����
	public Account(String digits, String name, int firstInput) {
		this.name = name;
		this.digits = digits;
		this.firstInput = firstInput;
	}

	@Override
	public String toString() {
		return "������ :" + name + ", ���¹�ȣ  :" + digits + ", �ܾ� :" + firstInput;
	}

}
