package Ŭ����;

public class Room {

	public static void main(String[] args) {

	Dog dog1 = new Dog();
	Dog dog2 = new Dog();
	Girl girl1 = new Girl();
	Girl girl2 = new Girl();
	
	dog1.color = "���";
	dog1.name = "�챸";
	System.out.println("�� �������� �̸��� " + dog1.name);
	System.out.println("���� " + dog1.color);
	dog1.bark(); // method call �޼ҵ� ȣ��
	dog1.tail();
	
	System.out.println("-----------------");
	
	dog2.color = "����";
	dog2.name = "��";
	System.out.println("�� �������� �̸��� " + dog2.name);
	System.out.println("���� " + dog2.color);
	dog1.bark();
	dog1.tail();
	
	System.out.println("-----------------");
	
	girl1.name = "����";
	girl1.age = 22;
	girl1.glasses = false;
	System.out.println("�̸��� " + girl1.name);
	System.out.println("���̴�" + girl1.age);
	System.out.println("�Ȱ� �� ���� : " + girl1.glasses);
	girl1.laugh();
	girl1.eat();
	girl1.drink();
	
	System.out.println("-----------------");

	girl2.name = "����";
	girl2.age = 25;
	girl2.glasses = false;
	System.out.println("�̸��� " + girl2.name);
	System.out.println("���̴� " + girl2.age);
	System.out.println("�Ȱ� �� ���� : " + girl2.glasses);
	girl2.laugh();
	girl2.eat();
	girl2.drink();
	
	}

}
