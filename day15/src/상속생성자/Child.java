package ��ӻ�����;

public final class Child extends Parent {
	// ���� Ŭ����

	@Override
	void tv() {
		System.out.println("���ѵ���");
	}
	
	void together() {
		tv(); // ���� tv�� ����
		super.tv(); // �θ���� tv�� ����
	}
	
}
