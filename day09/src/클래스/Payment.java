package Ŭ����;

public class Payment {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		int num = 5;
		int salary = 1000000;
		int result1 = cal.multi(num, salary);

		int num2 = 8;
		int salary2 = 1200000;
		int result2 = cal.multi(num2, salary2);

		System.out.println();
		int totalresult = cal.add(result1, result2);
		if (totalresult >= 13000000) {
			System.out.println("������ ���ҳ׿�");
		} else {
			System.out.println("������ �������ϴ�");
		}

	}

}
