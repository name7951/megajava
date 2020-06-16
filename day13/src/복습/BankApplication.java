package 복습;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList(); // 계좌목록 관리

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 >> ");
			int num = sc.nextInt();

			if (num == 5) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
			if (num == 1) { // 계좌생성 후 list에 추가
				System.out.println("=========");
				System.out.println("계좌 생성");
				System.out.println("=========");

				System.out.print("계좌번호 : ");
				String digits = sc.next();
				System.out.print("계좌주 : ");
				String name = sc.next();
				System.out.print("초기입금액 : ");
				int firstInput = sc.nextInt();

				Account a = new Account(digits, name, firstInput);

				list.add(a);

			} else if (num == 2) { // 계좌목록

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

			} else if (num == 3) {

				System.out.println("=========");
				System.out.println("예금");
				System.out.println("=========");

				System.out.print("계좌번호 : ");
				String digits = sc.next();
				int index = 0; // list내의 인덱스

				for (int i = 0; i < list.size(); i++) {
					Account a = (Account) list.get(i);
					if (a.digits.equals(digits)) {
						index = i;
					}
				}

				Account a = (Account) list.get(index);
				System.out.print("입금액 : ");
				int input = sc.nextInt();
				a.firstInput = a.firstInput + input;

				System.out.println("예금이 완료되었습니다");

			} else if (num == 4) {

				System.out.println("=========");
				System.out.println("출금");
				System.out.println("=========");

				System.out.print("계좌번호 : ");
				String digits = sc.next(); // 1번 계좌

				int index = 0; // list내의 인덱스

				for (int i = 0; i < list.size(); i++) {
					Account a = (Account) list.get(i);
					if (a.digits.equals(digits)) {
						index = i;
					}
				}

				Account a = (Account) list.get(index);
				System.out.print("출금액 : ");
				int input = sc.nextInt();
				a.firstInput = a.firstInput - input;

				System.out.println("출금이 완료되었습니다");

			} else {
				System.out.println("다시 시도해주세요");
			}

		} // while end

	} // main end

} // class end
