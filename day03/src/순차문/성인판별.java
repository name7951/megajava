package ������;

import javax.swing.JOptionPane;

public class �����Ǻ� {

	public static void main(String[] args) {

		//�̸��� �Է��ؼ� ���
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		
		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		int age2 = Integer.parseInt(age); // �м��غ��� �������� int�� ��ȯ

		//���ǹ�
		if (age2 >= 18) {
			JOptionPane.showMessageDialog(null, name + "���� �����Դϴ�");
		} else {
			JOptionPane.showMessageDialog(null, name + "���� �̼������Դϴ�");
		}
		
	}

}
