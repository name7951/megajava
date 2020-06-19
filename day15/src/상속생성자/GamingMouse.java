package 상속생성자;

public class GamingMouse extends Mouse {

	int velocity;

	public GamingMouse(String color, String company, int price, int velocity) {
		super(color, company, price);
		this.velocity = velocity;
	}

	@Override
	public String toString() {
		return "GamingMouse [velocity=" + velocity + ", color=" + color + ", company=" + company + ", price=" + price
				+ "]";
	}

}
