package 인터페이스;

public class CarUser {

	public static void main(String[] args) {

		AppleCar car1 = new AppleCar();
		BanannaCar car2 = new BanannaCar();
		
		car1.speedUp();
		car1.speedDown();
		car1.stop();
		
		car2.speedUp();
		car2.speedDown();
		car2.stop();
		
	}

}
