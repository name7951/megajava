package 예외처리;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 강제예외처리1 {

	public static void main(String[] args) {
		// 파일 입출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘 날짜 : ");
		String day = sc.next();
		System.out.print("일기 제목 : ");
		String title = sc.next();
		System.out.print("일기 내용 : ");
		String content = sc.next();
		
		FileWriter file = null;
		
		try {
			file = new FileWriter(day + ".txt");
			file.write(day + "\n");
			file.write(title + "\n");
			file.write(content + "\n");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("파일로 저장시 에러가 발생함");
		} catch (Exception e) {
			System.out.println("파일 입출력 이외의 에러가 발생");
		} finally {
			// 반드시 처리해야 할 내용이 있다면
			// 에러 발생 유무와 상관없이 무조건 처리
			try {
				file.close();
			} catch (Exception e2) {
				
			}
		}
		

	}

}
