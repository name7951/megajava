package �������;

public class Day {
	// �ν��Ͻ� ����
	String action;
	int time;
	String place;
	// ����ƽ ����
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
		return "Day [������ = " + action + ", �󸶳� = " + time + ", ��� = " + place + "]";
	}

}
