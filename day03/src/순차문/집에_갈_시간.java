package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class ����_��_�ð� {

	public static void main(String[] args) {

		// �ð��� �����ִ� Ŭ����
		// Date, Calendar
		Date date = new Date();
		
		int time = date.getHours();
		System.out.println(date.getSeconds());
		
		//���ǹ�
		if (time >= 22) {
			JOptionPane.showMessageDialog(null, "���� �� �ð��� �� �� ���ҳ׿�");
		} else {
			JOptionPane.showMessageDialog(null, "���� �� �ð��� ���� ���ҳ׿�");
		}
		
	}

}
