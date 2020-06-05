package 생성자;

public class BankAccount {

	String name;
	String type;
	int money;

	// 기본 생성자, 명시적
	// 파라메터 있는 생성자가 하나도 없는 경우 자동 생성
	// 접근 제어자 : public, protected, default(x), private
	// public - 같은 프로젝트에서 사용 가능
	// default(x) - 같은 패키지 내에서 접근하여 사용 가능
	public BankAccount() {
	}

	public BankAccount(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public BankAccount(String name, String type, int money) {
		this.name = name;
		this.type = type;
		this.money = money;
	}

}
