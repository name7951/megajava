package �迭����;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Dairy {

	public static void main(String[] args) throws Exception {
		// �Է� �ޱ�
		String day = JOptionPane.showInputDialog("��¥ �Է�");
		String title = JOptionPane.showInputDialog("���� �Է�");
		String content = JOptionPane.showInputDialog("���� �Է�");
		
		// ��ġ �����ؼ� ����
//		File file = new File("c:/zzz");
//		System.out.println("������ ���� ���� >> " + file.exists());
		
		FileWriter file = new FileWriter(day + ".txt"); // ���� �۾� ���� project�� ���� (day08)
		file.write(day + "\n");
		file.write(title + "\n");
		file.write(content);
		file.close();
				
	}

}
