package company;

public class Employee {

	public String name = "ȫ�浿"; // ���� package + �ٸ� package ���� ����
	protected int salary = 200; // ���� package + �ٸ� package(��� ���迡 ���� ��) ���� ����
	String address = "����"; // default - ���� package ������ ���� ����
	private int rrn = 990111; // �ش� Ŭ������ ���� ����
	// ��������
	// public > protected > default > private

	@Override
	public String toString() {
		return "�̸� = " + name + ", �ּ� = " + address + ", ���� = " + salary + ", �ֹι�ȣ = " + rrn;
	}

}
