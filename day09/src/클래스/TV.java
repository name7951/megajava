package Ŭ����;

public class TV {
	// ������� , ��������(�ڵ� �ʱ�ȭ)
	int ch; // 0���� �ʱ�ȭ
	boolean OnOff; // false���� �ʱ�ȭ

	// ��ü�� ������ ������ �ڵ����� ���� (ȣ��)
	// ������
	public TV(int x, boolean y) {
		ch = x;
		OnOff = y;
	}

	// ����޼ҵ�
	public void On() {
		System.out.println("TV�� �Ѵ�");
	}

	public void Off() {
		System.out.println("TV�� ����");
	}

	// ������(override)
	public String toString() {
		return "ä����" + ch + ", " + "������ " + OnOff;
	}

}
