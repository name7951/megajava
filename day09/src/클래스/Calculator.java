package 클래스;

public class Calculator {
	// Class를 만들 때는 하난의 역할만 집중할 수 있도록 만들어야 함
	// 응집도를 높이는 것
	
	// 동작 - 멤버메소드
	// 더하기, 곱하기
	public int add(int x, int y) {
		int result = x + y;
		System.out.println("두 수를 더한 결과 : " + result);
		return result;
	}
	public int multi(int num, int salary) {
		int result = num * salary;
		System.out.println("두 수를 곱한 결과 : " + result);
		return result;
	}
		
}
