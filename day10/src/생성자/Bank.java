package 생성자;

public class Bank {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// BankAccount account = new BankAccount(); -- 사용 불가능
		// 파라메터 있는 생성자가 있는 경우, 기본 생성자 만들기 불가능
		// super();
		BankAccount account0 = new BankAccount();
		account0.name = "김길식";
		account0.type = "저금";
		account0.money = 20000;

		BankAccount account1 = new BankAccount("박규민", "적금", 10000);
		BankAccount account2 = new BankAccount("홍길동", "예금");
		account2.money = 30000;

	}

}
