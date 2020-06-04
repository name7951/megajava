package 클래스;

public class Store {

	public static void main(String[] args) {
		// 객체 생성
		FishbreadFrame bread1 = new FishbreadFrame();
		FishbreadFrame bread2 = new FishbreadFrame();

		bread1.shape = "아기붕어";
		System.out.println("이 붕어빵의 모양은 " + bread1.shape + "모양이고, ");
		bread1.source = "팥";
		System.out.println(bread1.source + "이 들어있다");
		bread1.buy(); // 접근 연산자
		bread1.eat();

	}

}
