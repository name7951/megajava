package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		Date date = new Date();
			
		int hour = date.getHours();
				
		if (hour <= 11) {
			JOptionPane.showMessageDialog(null, "�¸��");
		} else if (hour <= 16) {
			JOptionPane.showMessageDialog(null, "�¾����ʹ�");
		} else if (hour <= 22) {
			JOptionPane.showMessageDialog(null, "���̺��");
		} else {
			JOptionPane.showMessageDialog(null, "�³���");
		}
		
		int month = date.getMonth() + 1;
		
		if ( month == 2) {
			JOptionPane.showMessageDialog(null, "28�ϱ��� �ֽ��ϴ�");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			JOptionPane.showMessageDialog(null, "30�ϱ��� �ֽ��ϴ�");
		} else {
			JOptionPane.showMessageDialog(null, "31�ϱ��� �ֽ��ϴ�");
		}
		
	}

}
