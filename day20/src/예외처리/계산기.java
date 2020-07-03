package 예외처리;

public class 계산기 {
	// 예외 처리 방법
	// 1. 예외 처리가 발생한 장소에서 바로 처리 - try catch
	// 2. 예외 처리할 메소드를 호출한 곳으로 떠넘기는 방법
	public void div(int n) {

		try {
			System.out.println(n / 0);
		} catch (Exception e) {
			System.out.println("에러 처리함");
		}
	}

	public void div2(int n) throws Exception {

		System.out.println(n / 0);

	}

	public void mul() {

		int[] num = { 1, 2 };
		try {
			System.out.println(num[2]);
		} catch (Exception e) {
			System.out.println("에러 처리함");
		}

	}

	public void div3() throws Exception {

		int[] num = { 1, 2 };
		System.out.println(num[2]);

	}

}
