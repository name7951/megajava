package 상속;

public class SuperMan extends Man {
	// 변수 3개, 메소드 2개
	boolean sky;

	public void space() {
		System.out.println(name + "이(가) 우주를 난다");

	}

	@Override // Annotation(표시)
	public void run() {
		System.out.println("슈웅우우우우웅우ㅜ웅");
	}

	@Override
	public String toString() {
		return "SuperMan [sky=" + sky + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

}
