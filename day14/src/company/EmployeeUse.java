package company;

public class EmployeeUse {

	public static void main(String[] args) {

		Employee e = new Employee();
		System.out.println("이름 : " + e.name);
		System.out.println("연봉 : " + e.salary);
		System.out.println("주소 : " + e.address);
//		System.out.println(e.rrn); - Visibility(가시성)이 없다
		
	}

}
