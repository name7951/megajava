package 데이터;

public class 기본데이터2 {

	public static void main(String[] args) {

		// 기본 데이터
		int age = 100;
		double height = 185.2;
		boolean food = false; // true
		char gender = '남'; // 문자
		
		// 기본 데이터는 아니지만 기본 데이터처럼 사용
		String name = "박규민"; // 스트링, 문자열 (실처럼 풀어서)
		// String name = new String("박규민") 처럼 사용하기도 함
		
		System.out.println("제 이름은 " + name + "입니다");
		System.out.println("내 나이는 " + age + "세 입니다");
		System.out.println("내 키는 " + height + "cm 입니다");
		System.out.println("저녁은 먹었나요? : " + food);
		System.out.println("저는 " + gender + "자 입니다");
		// 한 줄 복사 : ctrl + alt + 화살표 아래
		// 한 줄 이동: alt + 화살표 위 아래
		
	}

}
