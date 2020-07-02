package 인터페이스;

public class AppleCar implements Car {

	@Override
	public void speedUp() {
		System.out.println("속도를 UP");
	}

	@Override
	public void speedDown() {
		System.out.println("속도를 DOWN");
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}

}
