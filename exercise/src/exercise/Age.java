package exercise;

import javax.swing.JOptionPane;

public class Age {

	public static void main(String[] args) {

		String[] age = new String[4];
		int sum = 0;

		for (int i = 0; i < age.length; i++) {
			age[i] = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
			sum = sum + Integer.parseInt(age[i]);
		}

		System.out.println("���� ������ ����� " + ((double) sum / age.length) + "���Դϴ�");

	}

}
