package network;

import java.io.IOException;
import java.net.Socket;

public class TCPClient3 {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i < 101; i++) {
			Socket socket = new Socket("localhost", 9100);
			System.out.println("Ŭ���̾�Ʈ " + i + " : ������ ���� ����");
		}

	}

}
