package ����ȯ;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

class ����������ȯ {

	public static void main(String[] args) {
		// �迭�� ����ȯ�� ����
		// Ŭ���� ����, Ŭ������ �������̽� ���� ����
		// ���, �������迡���� ����

		// ��� ���迡���� ��Ҵ� �������� ����

		ArrayList list = new ArrayList();
		// �ƹ��ų� ����, ũ�⵵ ���� ����
		// object�� ��� Ŭ������ �ֻ��� �θ�
		// �� ĳ���õǾ� ��
		// �θ��ڸ��� ���� ������, �ڽ��� �θ��ڸ��� �� �� ����
		// �ڵ� ����ȯ
		list.add("����");
		list.add(100); // Integer (���� Ŭ����)
		// �⺻�� ---(boxing)---> ���� Ŭ���� (auto boxing)
		// �⺻�� <--(unboxing)-- ���� Ŭ���� (auto unboxing)
		list.add(11.22); // double
		list.add(true); // boolean
		list.add(new JButton());
		list.add(new JLabel());

		Object food = list.get(0); // Object
		String food2 = (String) list.get(0);
		
	}

}
