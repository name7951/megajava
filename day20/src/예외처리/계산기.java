package ����ó��;

public class ���� {
	// ���� ó�� ���
	// 1. ���� ó���� �߻��� ��ҿ��� �ٷ� ó�� - try catch
	// 2. ���� ó���� �޼ҵ带 ȣ���� ������ ���ѱ�� ���
	public void div(int n) {

		try {
			System.out.println(n / 0);
		} catch (Exception e) {
			System.out.println("���� ó����");
		}
	}

	public void div2(int n) throws Exception {

		System.out.println(n / 0);

	}

	public void mul() {

		int[] num = { 1, 2 };
		try {
			System.out.println(num[2]);
		} catch (Exception e) {
			System.out.println("���� ó����");
		}

	}

	public void div3() throws Exception {

		int[] num = { 1, 2 };
		System.out.println(num[2]);

	}

}
