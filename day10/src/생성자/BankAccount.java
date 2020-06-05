package ������;

public class BankAccount {

	String name;
	String type;
	int money;

	// �⺻ ������, �����
	// �Ķ���� �ִ� �����ڰ� �ϳ��� ���� ��� �ڵ� ����
	// ���� ������ : public, protected, default(x), private
	// public - ���� ������Ʈ���� ��� ����
	// default(x) - ���� ��Ű�� ������ �����Ͽ� ��� ����
	public BankAccount() {
	}

	public BankAccount(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public BankAccount(String name, String type, int money) {
		this.name = name;
		this.type = type;
		this.money = money;
	}

}
