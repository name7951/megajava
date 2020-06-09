package 복습;

public class Tv {
	// 메소드 영역
	// 멤버변수, 전역변수, 자동 초기화
	int channel;
	int vol;
	boolean onoff;
	static int count;
	
	// 생성자 오버로딩, 입력값 다르게하면 동일한 메소드를 사용
	public Tv(int channel, int vol, boolean onoff) {
		count++; // 정적변수
//		System.out.println("객체 생성 개수는 " + count);
		this.channel = channel;
		this.vol = vol;
		this.onoff = onoff;
	}

	@Override
	public String toString() {
		return "Tv [채널 =" + channel + ", 볼륨 =" + vol + ", 전원 =" + onoff + "]";
	}
	
}
