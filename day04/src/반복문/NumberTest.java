package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class NumberTest {

	public static void main(String[] args) {

		Random r =new Random();
		int count = 0;
		
		while(true) {
			String exit = JOptionPane.showInputDialog("����: X   ���: �ƹ� Ű�� ��������");
			if (exit.equals("X")) {
				System.out.println("�ý��� ����");
				System.out.println(count + "ȸ �õ�");
				break;
			}
			count++;
			
			int first = r.nextInt(100);
			int second = r.nextInt(100);
			
			if (first > second) {
				System.out.println(count + ". ù��° ���ڰ� �ι�° ���ں��� ũ��");
				System.out.print(first + " ");
				System.out.println(second);
			} else if (first == second) {
				System.out.println(count + ". �� ���ڰ� ����");
				System.out.print(first + " ");
				System.out.println(second);
			} else {
				System.out.println(count +". �ι�° ���ڰ� ù��° ���ں��� ũ��");
				System.out.print(first + " ");
				System.out.println(second);
			}
			
			}
		
	}
}
