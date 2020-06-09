package 정적멤버;

public class MyDaily {

	public static void main(String[] args) {

		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + "번째 날");
		System.out.println(Day.totalTime);
		System.out.println(day1);

		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count + "번째 날");
		System.out.println(Day.totalTime);
		System.out.println(day2);

		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count + "번째 날");
		System.out.println(Day.totalTime);
		System.out.println(day3);

	}

}
