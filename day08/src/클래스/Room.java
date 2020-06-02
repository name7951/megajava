package 클래스;

public class Room {

	public static void main(String[] args) {

	Dog dog1 = new Dog();
	Dog dog2 = new Dog();
	Girl girl1 = new Girl();
	Girl girl2 = new Girl();
	
	dog1.color = "흰색";
	dog1.name = "살구";
	System.out.println("이 강아지의 이름은 " + dog1.name);
	System.out.println("색은 " + dog1.color);
	dog1.bark(); // method call 메소드 호출
	dog1.tail();
	
	System.out.println("-----------------");
	
	dog2.color = "갈색";
	dog2.name = "루";
	System.out.println("이 강아지의 이름은 " + dog2.name);
	System.out.println("색은 " + dog2.color);
	dog1.bark();
	dog1.tail();
	
	System.out.println("-----------------");
	
	girl1.name = "다현";
	girl1.age = 22;
	girl1.glasses = false;
	System.out.println("이름은 " + girl1.name);
	System.out.println("나이는" + girl1.age);
	System.out.println("안경 쓴 여부 : " + girl1.glasses);
	girl1.laugh();
	girl1.eat();
	girl1.drink();
	
	System.out.println("-----------------");

	girl2.name = "정연";
	girl2.age = 25;
	girl2.glasses = false;
	System.out.println("이름은 " + girl2.name);
	System.out.println("나이는 " + girl2.age);
	System.out.println("안경 쓴 여부 : " + girl2.glasses);
	girl2.laugh();
	girl2.eat();
	girl2.drink();
	
	}

}
