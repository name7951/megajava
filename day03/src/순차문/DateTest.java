package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();
		// ��, ��, ��, ����
		// ��, �� , ��
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int daily = date.getDate();
		int day = date.getDay();
		
		System.out.println(day);
		if (day == 0 || day == 6) { // �Ͽ��� �Ǵ� ����� - �ָ�
			System.out.println("�ָ�");
		} else if (day == 1) { // ������
			System.out.println("������");
		} else if (day == 2) { // ȭ����
			System.out.println("ȭ����");
		} else {
			System.out.println("�ٸ� ��");
		}
		
		
		//JOptionPane.showMessageDialog(null, year + "�� " + month + "�� " + daily + "�� " + day + "����");
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		//JOptionPane.showMessageDialog(null, hour + "�� " + min + "�� " + sec + "�� ");
		
	}

}
