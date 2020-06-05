package 클래스복습;

public class Car {
	// 특징(응집도)
	// 성질 - 멤버변수, 전역변수(자동 초기화)
	String wheel; // 바퀴모양, null
	int speed; // 속도, 0

	// 객체 생성시 자동 호출되는 메소드(생성자 메소드)
	// 생성자 메소드는 반환을 표기하지 않음
	// 클래스의 이름과 동일하게 만들어야 호출 가능 (Car)
	// 파라메터 있는 생성자
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}

	// 동작 - 멤버메소드 (입력값, 반환값 유무)
	// 매개변수 = 파라메터(parameter)
	public void speedUp(int speed) { // speedUp(50)
		this.speed = this.speed + speed; // this. 를 사용하면 전역변수에 들어있는 변수 사용
		System.out.println(this.speed + "km/h 로 속도 UP");
	}

	public int nowSpeed() {
		return speed;
	}

	public void speedDown() {
		System.out.println("속도 DOWN");
	}

	@Override // 오버라이드 - 기능 재정의
	public String toString() {
		return "Car [바퀴= " + wheel + ", 현재 속도= " + speed + "km/h]";
	}

}
