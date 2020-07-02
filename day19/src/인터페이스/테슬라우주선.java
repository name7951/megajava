package 인터페이스;

public interface 테슬라우주선 extends Spaceship, Airplane {
	// 일반 변수는 사용 불가능
	public final String NAME = "테슬라"; // 상수만 가능

	// 메소드 2개를 가지고 시작
	// 인터페이스도 (다중)상속 가능

	// public abstract는 생략 가능
	public abstract void jump(); // 완벽하지 않은 메소드 정의 - 추상 메소드

}
