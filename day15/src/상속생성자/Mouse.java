package 상속생성자;

public class Mouse {

	String color;
	String company;
	int price;

	public Mouse() {
		
	}
	
	public Mouse(String color, String company, int price) {
		super();
		this.color = color;
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mouse [color=" + color + ", company=" + company + ", price=" + price + "]";
	}

}
