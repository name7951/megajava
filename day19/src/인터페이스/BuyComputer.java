package �������̽�;

public class BuyComputer {

	public static void main(String[] args) {

		AppleComputer c1 = new AppleComputer();
		BanannaComputer c2 = new BanannaComputer();

		System.out.println("AppleComputer Ȯ��");
		c1.cal();
		c1.internet();
		System.out.println("--------------------");
		System.out.println("BanannaComputer Ȯ��");
		c2.cal();
		c2.internet();

	}

}
