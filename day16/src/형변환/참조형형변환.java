package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

class 참조형형변환 {

	public static void main(String[] args) {
		// 배열의 형변환은 없음
		// 클래스 사이, 클래스와 인터페이스 사이 가능
		// 상속, 구현관계에서만 가능

		// 상속 관계에서의 대소는 개념으로 구분

		ArrayList list = new ArrayList();
		// 아무거나 들어가고, 크기도 조절 가능
		// object는 모든 클래스의 최상위 부모
		// 업 캐스팅되어 들어감
		// 부모자리로 맞춰 놓으면, 자식이 부모자리에 들어갈 수 있음
		// 자동 형변환
		list.add("고구마");
		list.add(100); // Integer (포장 클래스)
		// 기본형 ---(boxing)---> 포장 클래스 (auto boxing)
		// 기본형 <--(unboxing)-- 포장 클래스 (auto unboxing)
		list.add(11.22); // double
		list.add(true); // boolean
		list.add(new JButton());
		list.add(new JLabel());

		Object food = list.get(0); // Object
		String food2 = (String) list.get(0);
		
	}

}
