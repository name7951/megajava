package company2;

import company.Employee;

public class EmployeeUse {

	public static void main(String[] args) {

		Employee e = new Employee();
		System.out.println("이름 : " + e.name);
//		public으로 설정하지 않아서 가시성이 없음
//		System.out.println("연봉 : " + e.salary);
//		System.out.println("주소 : " + e.address);
		
	}

}
