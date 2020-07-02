package 인터페이스;

public class BuyComputer {

	public static void main(String[] args) {

		AppleComputer c1 = new AppleComputer();
		BanannaComputer c2 = new BanannaComputer();

		System.out.println("AppleComputer 확인");
		c1.cal();
		c1.internet();
		System.out.println("--------------------");
		System.out.println("BanannaComputer 확인");
		c2.cal();
		c2.internet();

	}

}
