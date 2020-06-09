package 정적멤버;

public class Day {
	// 인스턴스 변수
	String action;
	int time;
	String place;
	// 스태틱 변수
	static int count;
	static int totalTime;

	public Day(String action, int time, String place) {
		count++;
		totalTime += time; // totalTime + time = totalTime
		this.action = action;
		this.time = time;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Day [무엇을 = " + action + ", 얼마나 = " + time + ", 어디서 = " + place + "]";
	}

}
