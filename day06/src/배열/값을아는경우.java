package 배열;

public class 값을아는경우 {
		// 이 안에 들어가는 변수
		// 전역변수(global 변수)
	public static void main(String[] args) {
		// 함수 내의 지역에서만 생존할 수 있는 변수: 지역변수(local 변수)
		
		String[] name = {"둘리", "또치", "희동이"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		for (String x : name) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		char[] gender = {'남', '여', '남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		
		for (char c : gender) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		int[] age = {100, 200, 5};
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		
		for (int i : age) { // i -> int
			System.out.print(i + " ");
		}
		System.out.println();
		
		double[] height = {150.7, 165.4, 110};
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
		System.out.println();
		
		for (double d : height) {
			System.out.print(d + " ");
		}
		System.out.println();
		
	}

}
