package 정적멤버;

public class WorkerTest {

	public static void main(String[] args) {

		Worker wk1 = new Worker("임아무개", "남,", 24);
		Worker wk2 = new Worker("김아무개", "여,", 23);
		Worker wk3 = new Worker("박아무개", "남,", 25);

		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3);
		
		System.out.println("첫 번째 직원의 이름 : " + wk1.getName());
		System.out.println("전체 직원 수 : " + Worker.count + "명");
		System.out.println("직원들의 평균 나이 : " + (double) (Worker.totalAge / Worker.count) + "세");

		System.out.println();
		System.out.println("전체 직원 수는 " + Worker.getCount() + "명");
		System.out.println("평균 나이는 " + Worker.getTotalAge() / Worker.getCount() + "세");
		
	}

}
