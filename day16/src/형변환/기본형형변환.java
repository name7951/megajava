package ����ȯ;

public class �⺻������ȯ {

	public static void main(String[] args) {

		byte n1 = 100; // -128 ~ 128
		int n2 = n1; // int�� �ڵ� ��ȯ, Ÿ�Ժ�ȯ(�ڵ� ����ȯ, �� ĳ����)

		byte n3 = (byte) n2; // ������ byte�� ��ȯ�Ǿ�� �� �� ����, Ÿ�Ժ�ȯ(���� ����ȯ, �ٿ� ĳ����)

		int n4 = 2000;
		byte n5 = (byte) n4;
		// �Ұ����� ���� ������ ���� ĳ���� �� ���
		// ���� �ٸ� ���� ���� ��

	}

}
