package 상속생성자;

public final class Child extends Parent {
	// 종단 클래스

	@Override
	void tv() {
		System.out.println("무한도전");
	}
	
	void together() {
		tv(); // 내가 tv를 보다
		super.tv(); // 부모님이 tv를 보다
	}
	
}
