package Ŭ����;

public class Store {

	public static void main(String[] args) {
		// ��ü ����
		FishbreadFrame bread1 = new FishbreadFrame();
		FishbreadFrame bread2 = new FishbreadFrame();

		bread1.shape = "�Ʊ�ؾ�";
		System.out.println("�� �ؾ�� ����� " + bread1.shape + "����̰�, ");
		bread1.source = "��";
		System.out.println(bread1.source + "�� ����ִ�");
		bread1.buy(); // ���� ������
		bread1.eat();

	}

}
