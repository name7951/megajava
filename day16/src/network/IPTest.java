package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) throws Exception {
		// 127.0.0.1
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		System.out.println(ip);
		
	}

}
