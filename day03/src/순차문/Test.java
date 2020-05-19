package ¼øÂ÷¹®;

import java.util.Date;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		Date date = new Date();
			
		int hour = date.getHours();
				
		if (hour <= 11) {
			JOptionPane.showMessageDialog(null, "±Â¸ð´×");
		} else if (hour <= 16) {
			JOptionPane.showMessageDialog(null, "±Â¾ÖÇÁÅÍ´«");
		} else if (hour <= 22) {
			JOptionPane.showMessageDialog(null, "±ÂÀÌºê´×");
		} else {
			JOptionPane.showMessageDialog(null, "±Â³ªÀÕ");
		}
		
		int month = date.getMonth() + 1;
		
		if ( month == 2) {
			JOptionPane.showMessageDialog(null, "28ÀÏ±îÁö ÀÖ½À´Ï´Ù");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			JOptionPane.showMessageDialog(null, "30ÀÏ±îÁö ÀÖ½À´Ï´Ù");
		} else {
			JOptionPane.showMessageDialog(null, "31ÀÏ±îÁö ÀÖ½À´Ï´Ù");
		}
		
	}

}
