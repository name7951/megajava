package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.xml.crypto.Data;

public class UDPReceive {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket(9000);
		
		System.out.println("받는 쪽 소켓 시작 ");
		System.out.println("받을 준비 끝");
		
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		socket.receive(packet);
		System.out.println(new String(data));
		
		socket.close();
		
	}

}
