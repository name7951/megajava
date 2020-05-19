package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();
		// 년, 월, 일, 요일
		// 시, 분 , 초
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int daily = date.getDate();
		int day = date.getDay();
		
		System.out.println(day);
		if (day == 0 || day == 6) { // 일요일 또는 토요일 - 주말
			System.out.println("주말");
		} else if (day == 1) { // 월요일
			System.out.println("월요일");
		} else if (day == 2) { // 화요일
			System.out.println("화요일");
		} else {
			System.out.println("다른 날");
		}
		
		
		//JOptionPane.showMessageDialog(null, year + "년 " + month + "월 " + daily + "일 " + day + "요일");
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		//JOptionPane.showMessageDialog(null, hour + "시 " + min + "분 " + sec + "초 ");
		
	}

}
