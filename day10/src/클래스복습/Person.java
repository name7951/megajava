package 클래스복습;

public class Person {

	public static void main(String[] args) {

		Car car = new Car("금관모양", 150); // 객체 생성시 자동 호출
		// 객체 생성시 반드시 초기 설정

//		car.wheel = "금관모양";
//		car.speed = 150; // 현재 속도

		System.out.println("현재 속도 : " + car.nowSpeed() + "km/h");

		car.speedUp(50);
		System.out.println("현재 속도 : " + car.nowSpeed() + "km/h");

		car.speedDown();

		System.out.println(car.toString());

	}

}
