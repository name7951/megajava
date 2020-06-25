package exercise;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double output;
		double input;
		double balance = 5423;
		int number;

		while (true) {
			System.out.println("Welcome! Enter the number of your transaction >> ");
			System.out.println("Withdraw Cash: 1"); // 출금
			System.out.println("Make a Deposit: 2"); // 입금
			System.out.println("Check your Balace: 3"); // 잔액 조회
			System.out.println("Exit: 4");
			System.out.println("-----------------------");
			System.out.print("Transaction number: ");
			number = sc.nextInt();
			if (number == 1) {
				System.out.print("Enter amount: ");
				output = sc.nextDouble();
				if (output > balance) { // 출금액이 잔액보다 많을 경우
					System.out.println("Invalid withdrawal amount");
				} else {
					balance = balance - output;
					System.out.println("Withdrawal Success");
					System.out.println("");
				}
			} else if (number == 2) {
				System.out.print("Enter amount of deposit: ");
				input = sc.nextDouble();
				balance = balance + input;
				System.out.println("");
				System.out.println("Deposit Success");
			} else if (number == 3) {
				System.out.println("Your balance is $" + balance);
				System.out.println("");
			} else if (number == 4) {
				System.out.println("Thank you");
				break;
			} else {
				System.out.println("Invalid transaction");
			}
		}

	}

}
