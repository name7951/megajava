package 배열복습;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Dairy {

	public static void main(String[] args) throws Exception {
		// 입력 받기
		String day = JOptionPane.showInputDialog("날짜 입력");
		String title = JOptionPane.showInputDialog("제목 입력");
		String content = JOptionPane.showInputDialog("내용 입력");
		
		// 위치 지정해서 저장
//		File file = new File("c:/zzz");
//		System.out.println("파일의 존재 여부 >> " + file.exists());
		
		FileWriter file = new FileWriter(day + ".txt"); // 현재 작업 중인 project에 생성 (day08)
		file.write(day + "\n");
		file.write(title + "\n");
		file.write(content);
		file.close();
				
	}

}
