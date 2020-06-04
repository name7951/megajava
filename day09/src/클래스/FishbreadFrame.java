package 클래스;

public class FishbreadFrame {
	// 성질 -> 멤버변수 선언
	// 모양, 소 
	String shape;
	String source;
	
	// 동작 -> 멤버메소드 정의(함수 생성)
	// 사다, 먹다
	// 메소드는 인스턴스가 만들어진 이후에 사용 가능
	public void buy() {
		// 어떻게 동작할지 정의
		System.out.println("붕어빵을 사다");
	}
	public void eat() {
		System.out.println("붕어빵을 먹다");
	}
	
}
