package ����;

public class �������� {

	public static void main(String[] args) {

		// ����
		int hour = 7;
		// �Ǽ�
		double min = 0.49;
		// ����
		char day ='ȭ';
		// ��
		boolean dinner = true; // false
		
		System.out.println("���� �ð��� " + hour + "�� �Դϴ�");
		System.out.println("���� ���� " + min + "�� �Դϴ�");
		System.out.println("������ " + day + "���� �Դϴ�");
		System.out.println("�Ļ翩�δ� " + dinner);
		System.out.println();
		
		// String - �⺻�� �̿��� ������, Ư���ϰ� �⺻��ó�� ����� ���� ��
		String name = "�ڱԹ�";
		
		System.out.println("�� �̸��� " + name + " �Դϴ�");
		
		
		int num1 = 200;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		
		String n1 = "�ڱԹ�";
		String n2 = "ȫ�浿";
		
		System.out.println(n1.equals(n2));
		
		if (n1.equals(n2)) { // true �� ��
			System.out.println("�����ι� �Դϴ�");
		} else { // false �� ��
			System.out.println("�����ι��� �ƴմϴ�");
		}
		System.out.println();
		
		
		
	}

}
