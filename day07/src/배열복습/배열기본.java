package �迭����;

public class �迭�⺻ {

	public static void main(String[] args) {
		// 1. ���� ���� �����͸� �̹� �˰� �ִ� ���
		String[] food = {"¥���", "«��", "������"}; // �迭�� ���� Ÿ�Ը� ���� �� ����
		food[0] = "������";
		
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		
		for (String x : food) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		// 2. ���� ���� �����͸� �𸣴� ���
		String[] job = new String[3];
		
		job[0] = "�ǻ�";
		job[1] = "�ǻ�";
		job[2] = "�˻�";
		
		for (int i = 0; i < job.length; i++) {
			System.out.print(job[i] + " ");
		}
		System.out.println();
		
		for (String x : job) {
			System.out.println(x);
		}
		
	}

}
