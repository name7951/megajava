package 상속;

public class BadBank extends Bank {

	public BadBank() { // 안써도 상관 없음
		super(); // 맨 첫줄 - 기본값
	}

	@Override
	public void interest() {
		System.out.println("10%의 이자를 받다");
	}

}
