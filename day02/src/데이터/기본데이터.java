package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {

		// 변수 x, y, move
		int x = 300; // -21억 ~ 21억
		int y = 600;
		double move = 22.5;
		// 한 글자 이상은 기본 데이터가 아니다
		// 기본 데이터가 아닌 것은 다 부품을 사용
		
		System.out.println("우주선의 x축 값은" + x);
		System.out.println("우주선의 y축 값은" + y);
		// + : 결합 연산자
		
		x = 250;
		
		int z; // 선언
		int x2, y2, z2; // 쓰레기 값
		//System.out.println(x2); 
		// 쓰레기 값은 연산도 안되고, 처리대상도 아니다
		
	}

}
