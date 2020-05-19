package 복습;

public class 정리문제 {

	public static void main(String[] args) {

		// 정수
		int hour = 7;
		// 실수
		double min = 0.49;
		// 문자
		char day ='화';
		// 논리
		boolean dinner = true; // false
		
		System.out.println("현재 시각은 " + hour + "시 입니다");
		System.out.println("현재 분은 " + min + "분 입니다");
		System.out.println("오늘은 " + day + "요일 입니다");
		System.out.println("식사여부는 " + dinner);
		System.out.println();
		
		// String - 기본형 이외의 데이터, 특별하게 기본형처럼 만들어 놓은 것
		String name = "박규민";
		
		System.out.println("내 이름은 " + name + " 입니다");
		
		
		int num1 = 200;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		
		String n1 = "박규민";
		String n2 = "홍길동";
		
		System.out.println(n1.equals(n2));
		
		if (n1.equals(n2)) { // true 일 때
			System.out.println("동일인물 입니다");
		} else { // false 일 때
			System.out.println("동일인물이 아닙니다");
		}
		System.out.println();
		
		
		
	}

}
