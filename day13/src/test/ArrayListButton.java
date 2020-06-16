package test;

import java.util.ArrayList;

import javax.swing.JButton;

public class ArrayListButton {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		for (int i = 0; i < 5; i++) {
			JButton button = new JButton(i + "¹ø");
			list.add(button);
		}

		for (int i = 0; i < list.size(); i++) {
			JButton b2 = (JButton)list.get(i);
			System.out.println(b2.getText());
		}
		
	}

}
