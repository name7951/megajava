package 형변환;

public class HankokTire extends Tire {

	String company = "한국";
	
	@Override
	public void put() {
		System.out.println(company + "타이어를 끼다");
	}
	
}
