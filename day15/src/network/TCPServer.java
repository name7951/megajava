package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// ���ο� ���� �ʿ�
		// �ܺ� ���� - ����ó��
		// ��Ʈ�� �������� ������, ������ 5�ڸ� ��Ʈ�� ���� ����
		ServerSocket server = new ServerSocket(9100);
		System.out.println("TCP ���� ���� ����");
		System.out.println("Ŭ���̾�Ʈ�� ���� ��ٸ��� ��...");

		int count = 0; // ����� Ŭ���̾�Ʈ ��

		while (true) {
			// ������ ���޿� ����
			Socket socket = server.accept();
			count++;
			System.out.println(count + "���� Ŭ���̾�Ʈ ���� ����");
		}

		// ������ ���޿� ���� �ʿ�

	}

}
