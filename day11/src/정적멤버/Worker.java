package 정적멤버;

public class Worker {

	String name;
	String gender;
	int age;
	static int totalAge;
	static int count;

	public Worker(String name, String gender, int age) {
		count++;
		totalAge += age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// 인스턴스 변수를 가져오려고 할 때 사용
	// 객체를 생성한 후 메소드 호출 후 사용 가능
	// wk1.getName()
	public String getName() {
		return name;
	}

	// 스태틱 변수를 가져오려고 할 때 사용
	// 객체를 생성하지 않아도 사용 가능 (클래스 이름으로 접근)
	// Worker.gettotalAge()
	public static int getTotalAge() {
		return totalAge;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Worker [이름  = " + name + ", 성별 = " + gender + " 나이 = " + age + "]";
	}

}
