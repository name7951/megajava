package 배열;

public class 값을모르는경우 {

	public static void main(String[] args) {

		int[] num = new int[1000];
		System.out.println(num); // 주소값
		System.out.println(num[1]); // 위치값(index)
		System.out.println(num[999]);
		// 배열은 초기값이 다 들어있음
		// int -> 0, double -> 0.0
		num[500] = 1;
		num[666] = 1;
		System.out.println(num[500]);
		
		int[] seat = new int[21];
		// 읽기 전용 변수 : 배열의 개수
		System.out.println(seat.length);
		seat[2] = 1;
		seat[3] = 1;
		seat[4] = 1;
		seat[5] = 1;
		System.out.println(seat[0] == seat[2]);
		
		// for문 내에서의 i는 배열에서 index 역할 (i = index)
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		
	}

}
