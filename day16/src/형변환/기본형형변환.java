package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {

		byte n1 = 100; // -128 ~ 128
		int n2 = n1; // int로 자동 변환, 타입변환(자동 형변환, 업 캐스팅)

		byte n3 = (byte) n2; // 강제로 byte로 변환되어야 들어갈 수 있음, 타입변환(강제 형변환, 다운 캐스팅)

		int n4 = 2000;
		byte n5 = (byte) n4;
		// 불가능한 값의 범주의 강제 캐스팅 한 경우
		// 전혀 다른 값이 들어가게 됨

	}

}
