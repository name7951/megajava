package �������̽�;

public class AppleCar implements Car {

	@Override
	public void speedUp() {
		System.out.println("�ӵ��� UP");
	}

	@Override
	public void speedDown() {
		System.out.println("�ӵ��� DOWN");
	}

	@Override
	public void stop() {
		System.out.println("����");
	}

}
