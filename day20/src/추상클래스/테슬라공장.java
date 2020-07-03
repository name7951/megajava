package 추상클래스;

public class 테슬라공장 {

	public static void main(String[] args) {
		// 추상 클래스는 변수의 타입으로 사용 가능
		// 업 캐스팅하여 사용
		// 인터페이스도 변수의 타입으로 사용 가능
		Car bus = new 테슬라버스();
		Car truck = new 테슬라트럭();
		
		bus.run();
		truck.run();
		bus.load();
		truck.load();
		
	}

}
