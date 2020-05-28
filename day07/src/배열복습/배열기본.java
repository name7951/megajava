package 배열복습;

public class 배열기본 {

	public static void main(String[] args) {
		// 1. 많은 양의 데이터를 이미 알고 있는 경우
		String[] food = {"짜장면", "짬뽕", "탕수육"}; // 배열은 같은 타입만 묶을 수 있음
		food[0] = "군만두";
		
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		
		for (String x : food) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		// 2. 많은 양의 데이터를 모르는 경우
		String[] job = new String[3];
		
		job[0] = "의사";
		job[1] = "판사";
		job[2] = "검사";
		
		for (int i = 0; i < job.length; i++) {
			System.out.print(job[i] + " ");
		}
		System.out.println();
		
		for (String x : job) {
			System.out.println(x);
		}
		
	}

}
