package Ŭ��������;

public class Car {
	// Ư¡(������)
	// ���� - �������, ��������(�ڵ� �ʱ�ȭ)
	String wheel; // �������, null
	int speed; // �ӵ�, 0

	// ��ü ������ �ڵ� ȣ��Ǵ� �޼ҵ�(������ �޼ҵ�)
	// ������ �޼ҵ�� ��ȯ�� ǥ������ ����
	// Ŭ������ �̸��� �����ϰ� ������ ȣ�� ���� (Car)
	// �Ķ���� �ִ� ������
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}

	// ���� - ����޼ҵ� (�Է°�, ��ȯ�� ����)
	// �Ű����� = �Ķ����(parameter)
	public void speedUp(int speed) { // speedUp(50)
		this.speed = this.speed + speed; // this. �� ����ϸ� ���������� ����ִ� ���� ���
		System.out.println(this.speed + "km/h �� �ӵ� UP");
	}

	public int nowSpeed() {
		return speed;
	}

	public void speedDown() {
		System.out.println("�ӵ� DOWN");
	}

	@Override // �������̵� - ��� ������
	public String toString() {
		return "Car [����= " + wheel + ", ���� �ӵ�= " + speed + "km/h]";
	}

}
