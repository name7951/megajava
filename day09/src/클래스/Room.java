package Ŭ����;

public class Room {

	public static void main(String[] args) {

		TV tv1 = new TV(100, false); // ��������, �ʱ�ȭ���� ����
//		tv1.ch = 100;
//		tv1.OnOff = false;
		tv1.On();
		System.out.println(tv1);

		TV tv2 = new TV(200, true);
//		tv2.ch = 200;
//		tv2.OnOff = true;
		tv2.Off();
		System.out.println(tv2);

		System.out.println("-----------------");

		Phone phone1 = new Phone();
		phone1.type = "IPhone";
		phone1.year = 1;
		phone1.Break = false;
		System.out.println("�� ���� " + phone1.type + "�Դϴ�");
		System.out.println("�� ���� ������ " + phone1.year + "���� �ƽ��ϴ�");
		System.out.println("������ �μ����°� : " + phone1.Break);
		phone1.ring();
		phone1.alarm();

		System.out.println();

		Phone phone2 = new Phone();
		phone2.type = "Andriod";
		phone2.year = 3;
		phone2.Break = true;
		System.out.println("�� ���� " + phone2.type + "�Դϴ�");
		System.out.println("�� ���� ������ " + phone2.year + "���� �ƽ��ϴ�");
		System.out.println("������ �μ����°� : " + phone2.Break);
		phone2.ring();
		phone2.alarm();

	}

}
