package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class UDPSend {

	public static void main(String[] args) throws Exception {
		// 네트워크 연결 전송
		// class(전화기 역할 Socket)
		DatagramSocket socket = new DatagramSocket();

		String str = "I am a java programmer"; // 데이터 + 주소(ip + port)

		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");

		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 9000);
		
		socket.send(packet);
		socket.close();

	}

}
