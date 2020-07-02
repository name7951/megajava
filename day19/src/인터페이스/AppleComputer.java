package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void cal() {
		System.out.println("계산 중");
	}

	@Override
	public void internet() {
		System.out.println("인터넷 여는 중");
	}

}
