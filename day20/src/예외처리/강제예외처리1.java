package ����ó��;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ��������ó��1 {

	public static void main(String[] args) {
		// ���� �����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ��¥ : ");
		String day = sc.next();
		System.out.print("�ϱ� ���� : ");
		String title = sc.next();
		System.out.print("�ϱ� ���� : ");
		String content = sc.next();
		
		FileWriter file = null;
		
		try {
			file = new FileWriter(day + ".txt");
			file.write(day + "\n");
			file.write(title + "\n");
			file.write(content + "\n");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("���Ϸ� ����� ������ �߻���");
		} catch (Exception e) {
			System.out.println("���� ����� �̿��� ������ �߻�");
		} finally {
			// �ݵ�� ó���ؾ� �� ������ �ִٸ�
			// ���� �߻� ������ ������� ������ ó��
			try {
				file.close();
			} catch (Exception e2) {
				
			}
		}
		

	}

}
