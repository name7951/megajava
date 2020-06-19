package 다형성;

import 상속생성자.NormalBoard;
import 상속생성자.QnABoard;

public class 다형성테스트 {

	public static void main(String[] args) {

		NormalBoard re = new QnABoard(1, "자바", "펀자바", "홍길동", "짱짱");
		// 다형성 - 앞뒤가 다르다
		// 무조건 상속관계에 있어야 함
	
		
	}

}
