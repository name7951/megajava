package �迭;

public class �����ƴ°�� {
		// �� �ȿ� ���� ����
		// ��������(global ����)
	public static void main(String[] args) {
		// �Լ� ���� ���������� ������ �� �ִ� ����: ��������(local ����)
		
		String[] name = {"�Ѹ�", "��ġ", "����"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		for (String x : name) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		char[] gender = {'��', '��', '��'};
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
