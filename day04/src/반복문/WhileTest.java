package �ݺ���;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {

		int count = 10; // ���۰�
		
		while (count < 16) { // 0,1,2,3,4 ���ǽ�
			System.out.println(count + ". ���ѷ����� ������");
			count = count + 1; // ���������� : count++ - 1�� ����
		}
		
		System.out.println("---------------------");
		
		for (int i = 10; i < 16; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		for (int j = 0; j < 10; j++) {
			System.out.print(" �� ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		while(true) {
			// cpu�� ������ġ�� ���������� ���� �Ұ�
			// ó���� ��� ������, ���α׷��� RAM���� ������ ���� �����
			// ���� ���� �͵��� �̹� RAM�� �־���� ����
			// �빮�ڸ� �Ἥ �ٷ� ��� ����
			String hour = JOptionPane.showInputDialog("���� �ð���? (���� = X)");
			
			//X�� �������� Ȯ��
			//X�� �������� �ݺ����� ������ ó��
			if (hour.equals("X")) {
				System.out.println("�ý��� ����"); 
				break; // �ڽ��� �����ϰ� �ִ� �ݺ����� ����
			}
			System.out.println(hour + " �� �Դϴ�"); // ���� ������
			
		}
		
	}

}
