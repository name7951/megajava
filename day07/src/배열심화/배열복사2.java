package �迭��ȭ;

public class �迭����2 {

	public static void main(String[] args) {

		int[] x = {100, 200, 300};
		int[] y = x; // �������� ���� (���� ����)
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " + x[i] + ", " + "y: " + y[i]);
		}
		
		System.out.println();
		x[0] = 99;
		for (int i = 0; i < y.length; i++) {
			System.out.println("x: " + x[i] + ", " + "y: " + y[i]);
		}
		
		System.out.println();
		System.out.println("���� ���� x �ּ�: " + x);
		System.out.println("���� ���� y �ּ�: " + y);
		
		System.out.println("----------------------");
		
		int[] a = {100, 200, 300};
		int[] b = a.clone(); // �������� ���� (���� ����)
		
		System.out.println("���� ���� a �ּ�: " + a);
		System.out.println("���� ���� b �ּ�: " + b);
		
		System.out.println();
		a[0] = 99;
		for (int i = 0; i < y.length; i++) {
			System.out.println("a: " + a[i] + ", " + "b: " + b[i]);
		}
		
		System.out.println();
		System.out.println("���� ���� a �ּ�: " + a);
		System.out.println("���� ���� b �ּ�: " + b);
		
	}

}
