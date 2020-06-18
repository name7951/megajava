package company;

public class Employee {

	public String name = "홍길동"; // 같은 package + 다른 package 접근 가능
	protected int salary = 200; // 같은 package + 다른 package(상속 관계에 있을 때) 접근 가능
	String address = "은평구"; // default - 같은 package 내에서 접근 가능
	private int rrn = 990111; // 해당 클래스만 접근 가능
	// 접근제한
	// public > protected > default > private

	@Override
	public String toString() {
		return "이름 = " + name + ", 주소 = " + address + ", 연봉 = " + salary + ", 주민번호 = " + rrn;
	}

}
