package ���;

public class BadBank extends Bank {

	public BadBank() { // �Ƚᵵ ��� ����
		super(); // �� ù�� - �⺻��
	}

	@Override
	public void interest() {
		System.out.println("10%�� ���ڸ� �޴�");
	}

}
