package 상속생성자;

public class Parent {

	void tv() { // 같은 패키지 내에서 접근 가능
		System.out.println("아침마당");
	}
	
	final void play() { // 오버라이드(변경) 불불가 메소드
		System.out.println("등산");
	}
	
}
