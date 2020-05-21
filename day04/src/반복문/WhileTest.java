package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {

		int count = 10; // 시작값
		
		while (count < 16) { // 0,1,2,3,4 조건식
			System.out.println(count + ". 무한루프를 돌린다");
			count = count + 1; // 증감연산자 : count++ - 1씩 증가
		}
		
		System.out.println("---------------------");
		
		for (int i = 10; i < 16; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		for (int j = 0; j < 10; j++) {
			System.out.print(" ☆ ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		while(true) {
			// cpu는 저장위치에 직접적으로 접근 불가
			// 처리할 모든 데이터, 프로그램을 RAM에다 가져다 놓고 써야함
			// 자주 쓰는 것들은 이미 RAM에 넣어놓은 상태
			// 대문자를 써서 바로 사용 가능
			String hour = JOptionPane.showInputDialog("지금 시각은? (종료 = X)");
			
			//X를 눌렀는지 확인
			//X를 눌렀으면 반복문을 끝내는 처리
			if (hour.equals("X")) {
				System.out.println("시스템 종료"); 
				break; // 자신을 포함하고 있는 반복문을 끝냄
			}
			System.out.println(hour + " 시 입니다"); // 결합 연산자
			
		}
		
	}

}
