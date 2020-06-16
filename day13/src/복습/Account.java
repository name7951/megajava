package 복습;

public class Account {

	String name; // 계좌주
	String digits; // 계좌번호
	int firstInput; // 초기입금액

	// 객체 생성시 자동으로 호출되는 메소드 - 생성자 메소드
	// 입력값에 따라 메소드 호출
	// 파라메터가 있는 생성자를 만들면 객체 생성시 반드시 필요한 항목들 지정 가능
	public Account(String digits, String name, int firstInput) {
		this.name = name;
		this.digits = digits;
		this.firstInput = firstInput;
	}

	@Override
	public String toString() {
		return "계좌주 :" + name + ", 계좌번호  :" + digits + ", 잔액 :" + firstInput;
	}

}
