package �߻�Ŭ����;

// �׽��� class: ���赵�� �� �־�� �ϴ� ��� ����
// Car interface: �� �־��� �ϴ� ����� ����

public abstract class �׽��� implements Car {

	public abstract void load();
	
	@Override
	public void run() {
		System.out.println("����� �޸�");
		// ����ó���� �ϰ� ���� ���
		// try~catch, throws �� �ϳ�
		try {
			System.out.println(300 / 0);
		} catch (Exception e) {

		}

	}

}
