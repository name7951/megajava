package �迭;

public class �����𸣴°�� {

	public static void main(String[] args) {

		int[] num = new int[1000];
		System.out.println(num); // �ּҰ�
		System.out.println(num[1]); // ��ġ��(index)
		System.out.println(num[999]);
		// �迭�� �ʱⰪ�� �� �������
		// int -> 0, double -> 0.0
		num[500] = 1;
		num[666] = 1;
		System.out.println(num[500]);
		
		int[] seat = new int[21];
		// �б� ���� ���� : �迭�� ����
		System.out.println(seat.length);
		seat[2] = 1;
		seat[3] = 1;
		seat[4] = 1;
		seat[5] = 1;
		System.out.println(seat[0] == seat[2]);
		
		// for�� �������� i�� �迭���� index ���� (i = index)
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		
	}

}
