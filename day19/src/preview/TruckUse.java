package preview;

public class TruckUse {

	public static void main(String[] args) {
		// 업 캐스팅
		CoffeeTruck truck = new CoffeeTruck();
		
		//캐스팅 관계는 상속관계에서만 할 수 있음
//		Truck Truck2 = new CoffeeShop();
		
		// 다운 캐스팅
		CoffeeTruck coffee = (CoffeeTruck)truck;
		
		// 상속 관계에 있을 때만 가능
//		CoffeeShop coffee2 = (CoffeeShop)truck;
		
	}

}
