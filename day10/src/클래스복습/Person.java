package Ŭ��������;

public class Person {

	public static void main(String[] args) {

		Car car = new Car("�ݰ����", 150); // ��ü ������ �ڵ� ȣ��
		// ��ü ������ �ݵ�� �ʱ� ����

//		car.wheel = "�ݰ����";
//		car.speed = 150; // ���� �ӵ�

		System.out.println("���� �ӵ� : " + car.nowSpeed() + "km/h");

		car.speedUp(50);
		System.out.println("���� �ӵ� : " + car.nowSpeed() + "km/h");

		car.speedDown();

		System.out.println(car.toString());

	}

}
