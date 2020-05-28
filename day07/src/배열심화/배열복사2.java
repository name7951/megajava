package 배열심화;

public class 배열복사2 {

	public static void main(String[] args) {

		int[] x = {100, 200, 300};
		int[] y = x; // 참조형의 복사 (얕은 복사)
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " + x[i] + ", " + "y: " + y[i]);
		}
		
		System.out.println();
		x[0] = 99;
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " + x[i] + ", " + "y: " + y[i]);
		}
		
		System.out.println();
		System.out.println("얕은 복사 x 주소: " + x);
		System.out.println("얕은 복사 y 주소: " + y);
		
		System.out.println("----------------------");
		
		int[] a = {100, 200, 300};
		int[] b = a.clone(); // 참조형의 복사 (깊은 복사)
		
		System.out.println("깊은 복사 a 주소: " + a);
		System.out.println("깊은 복사 b 주소: " + b);
		
		System.out.println();
		a[0] = 99;
		for (int i = 0; i < y.length; i++) {
			System.out.println("a: " + a[i] + ", " + "b: " + b[i]);
		}
		
		System.out.println();
		System.out.println("깊은 복사 a 주소: " + a);
		System.out.println("깊은 복사 b 주소: " + b);
		
	}

}
