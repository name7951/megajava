package 추상클래스;

// 테슬라 class: 설계도에 꼭 있어야 하는 기능 구현
// Car interface: 꼭 있어햐 하는 기능을 정의

public abstract class 테슬라 implements Car {

	public abstract void load();
	
	@Override
	public void run() {
		System.out.println("전기로 달림");
		// 예외처리를 하고 싶은 경우
		// try~catch, throws 중 하나
		try {
			System.out.println(300 / 0);
		} catch (Exception e) {

		}

	}

}
