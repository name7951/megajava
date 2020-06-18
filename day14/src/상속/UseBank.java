package »ó¼Ó;

public class UseBank {

	public static void main(String[] args) {

		Bank b = new Bank();
		BadBank bb = new BadBank();
		GoodBank gb = new GoodBank();
		NormalBank nb = new NormalBank();
		
		b.interest();
		bb.interest();
		gb.interest();
		nb.interest();
		
	}

}
