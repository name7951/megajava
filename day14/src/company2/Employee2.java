package company2;

import company.Employee;

public class Employee2 extends Employee {

	public void work() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
//		System.out.println("주소 : " + address); - 다른 패키지에 있기 때문에 가시성 없음
	}
	
}
