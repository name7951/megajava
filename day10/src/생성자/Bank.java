package ������;

public class Bank {

	public static void main(String[] args) {
		// ������ �����ε�
		// BankAccount account = new BankAccount(); -- ��� �Ұ���
		// �Ķ���� �ִ� �����ڰ� �ִ� ���, �⺻ ������ ����� �Ұ���
		// super();
		BankAccount account0 = new BankAccount();
		account0.name = "����";
		account0.type = "����";
		account0.money = 20000;

		BankAccount account1 = new BankAccount("�ڱԹ�", "����", 10000);
		BankAccount account2 = new BankAccount("ȫ�浿", "����");
		account2.money = 30000;

	}

}
