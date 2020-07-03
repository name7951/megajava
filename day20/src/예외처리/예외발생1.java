package 예외처리;

public class 예외발생1 {

	public static void main(String[] args) throws Exception {
		
		int num = 30;
		System.out.println("에러 발생 전");
		
		// 계산 처리 부분은 계산기를 만들어서 부품을 사용
		계산기 cal = new 계산기();
		cal.div(num); // 1번으로 예외 처리
		
		// 호출한 곳에서 예외 처리 해야함
		cal.div2(num);
		
		System.out.println("에러 발생 후");

	}

}
