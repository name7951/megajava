package ������;

import javax.swing.JOptionPane;

public class ���̹��α��� {

	public static void main(String[] args) {

		String id = "root"; // ȸ������ �� ���� id
		String id2 = JOptionPane.showInputDialog("ID�� �Է��ϼ���");
		
		String pw = "abcd";
		String pw2 = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");
				
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("�α��� �Ǿ����ϴ�");
		} else {
			System.out.println("�ٽ� �õ����ּ���");
		}
		
	}

}
