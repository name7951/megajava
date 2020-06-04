package Å¬·¡½º;

public class ComputerStore {

	public static void main(String[] args) {

		Computer com = new Computer();
		
		int monitor = 200000;
		int main = 300000;
		int num = 3;
		
		int result = com.computer(monitor, main);
		int total = com.total(result, num);
		
	}

}
