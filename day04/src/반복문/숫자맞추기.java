package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ���ڸ��߱� {

	public static void main(String[] args) {

		// �ƹ� ���̳� ������ִ� class
		Random r = new Random();

		int target = r.nextInt(100); // ���� �������� ������ ���� (0~99) 
		int count = 0;

		while(true) {
			
			String data = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���");
			count++;
			
			int guess = Integer.parseInt(data);
			
			if (target == guess) {
				System.out.println(guess + " �����Դϴ�");
				System.out.println("�õ� Ƚ��: " + count);
				System.out.println("�ý����� �����մϴ�");
				break;
			} else {
				System.out.println(guess+ " �����Դϴ�");
				// �Է��� ���� ���亸�� ū�� ������ ��Ʈ
				if (target > guess) {
					System.out.println("UP");
				} else {
					System.out.println("DOWN");
				}
			}
		}
		
			
	}

}
