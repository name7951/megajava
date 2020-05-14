package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {

		// 논리적인 판단을 하려고 할 때
		// 조건이 두 개 이상인 경우
		// 조건이 두 개 다 만족해야하는지 : and 조건 (&&) - 로그인 처리
		// 조건이 두 개 중 하나만 만족해도:  or 조건 (||)
		
		// 가입 시 id, pw
		int id = 1111;
		int pw = 2222;
		
		// 입력한 id, pw
		int id2 = 1000;
		int pw2 = 2222;
		
		// 비교연산자는 기본 데이터만 비교 가능
		// 부품(class)는 비교 연산자 사용 불가
		if (id == id2 && pw == pw2) {
			System.out.println("환영합니다");
		} else {
			System.out.println("다시 시도해주세요");
		}
		
	}

}
