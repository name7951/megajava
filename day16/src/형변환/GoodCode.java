package 형변환;

public class GoodCode {
	// 하나의 class 안에 하나의 기능 - *응집도가 높은 코드*
	public static void main(String[] args) {
		// *결합도를 낮추는 코드*
		Tire t1 = new KumhoTire(); // 부모 클래스 + 자식 클래스 (변경해야 할 것을 최소한으로 줄이기)
		// 클래스의 다형성 - 상속 관계만 가능, 업 캐스팅(자동 형변환)
		t1.put();

	}

}
