package 클래스;

public class TV {
	// 멤버변수 , 전역변수(자동 초기화)
	int ch; // 0으로 초기화
	boolean OnOff; // false으로 초기화

	// 객체가 생성될 때마다 자동으로 사용됨 (호출)
	// 생성자
	public TV(int x, boolean y) {
		ch = x;
		OnOff = y;
	}

	// 멤버메소드
	public void On() {
		System.out.println("TV를 켜다");
	}

	public void Off() {
		System.out.println("TV를 끄다");
	}

	// 재정의(override)
	public String toString() {
		return "채널은" + ch + ", " + "전원은 " + OnOff;
	}

}
