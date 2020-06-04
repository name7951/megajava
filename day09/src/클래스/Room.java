package 클래스;

public class Room {

	public static void main(String[] args) {

		TV tv1 = new TV(100, false); // 지역변수, 초기화되지 않음
//		tv1.ch = 100;
//		tv1.OnOff = false;
		tv1.On();
		System.out.println(tv1);

		TV tv2 = new TV(200, true);
//		tv2.ch = 200;
//		tv2.OnOff = true;
		tv2.Off();
		System.out.println(tv2);

		System.out.println("-----------------");

		Phone phone1 = new Phone();
		phone1.type = "IPhone";
		phone1.year = 1;
		phone1.Break = false;
		System.out.println("이 폰은 " + phone1.type + "입니다");
		System.out.println("이 폰을 산지는 " + phone1.year + "년이 됐습니다");
		System.out.println("액정이 부서졌는가 : " + phone1.Break);
		phone1.ring();
		phone1.alarm();

		System.out.println();

		Phone phone2 = new Phone();
		phone2.type = "Andriod";
		phone2.year = 3;
		phone2.Break = true;
		System.out.println("이 폰은 " + phone2.type + "입니다");
		System.out.println("이 폰을 산지는 " + phone2.year + "년이 됐습니다");
		System.out.println("액정이 부서졌는가 : " + phone2.Break);
		phone2.ring();
		phone2.alarm();

	}

}
