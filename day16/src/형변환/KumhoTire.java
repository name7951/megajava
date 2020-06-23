package 형변환;

public class KumhoTire extends Tire {

	String company = "금호";
	
	@Override
	public void put() {
		System.out.println(company + "타이어를 끼다");
	}
	
}
