package ���;

public class SuperMan extends Man {
	// ���� 3��, �޼ҵ� 2��
	boolean sky;

	public void space() {
		System.out.println(name + "��(��) ���ָ� ����");

	}

	@Override // Annotation(ǥ��)
	public void run() {
		System.out.println("������������̿�");
	}

	@Override
	public String toString() {
		return "SuperMan [sky=" + sky + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

}
