package �������;

public class Worker {

	String name;
	String gender;
	int age;
	static int totalAge;
	static int count;

	public Worker(String name, String gender, int age) {
		count++;
		totalAge += age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// �ν��Ͻ� ������ ���������� �� �� ���
	// ��ü�� ������ �� �޼ҵ� ȣ�� �� ��� ����
	// wk1.getName()
	public String getName() {
		return name;
	}

	// ����ƽ ������ ���������� �� �� ���
	// ��ü�� �������� �ʾƵ� ��� ���� (Ŭ���� �̸����� ����)
	// Worker.gettotalAge()
	public static int getTotalAge() {
		return totalAge;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Worker [�̸�  = " + name + ", ���� = " + gender + " ���� = " + age + "]";
	}

}
