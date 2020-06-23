package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerB extends JFrame {
	// 전역변수 선언
	JTextArea list;
	JTextField input;
	DatagramSocket socket;

	public MessengerB() throws Exception {

		socket = new DatagramSocket(6000);

		setTitle("Messenger B");

		list = new JTextArea(15, 20); // 6줄에 20글자 씩
		input = new JTextField();

		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		pack();

		list.setEditable(false);

		list.setBackground(Color.BLACK);
		list.setForeground(Color.LIGHT_GRAY);
		input.setBackground(Color.red);
		input.setForeground(Color.black);

		Font font = new Font("굴림", Font.BOLD, 20);

		list.setFont(font);
		input.setFont(font);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력한 값을 가지고 와야 함
				String str = input.getText();
				// 리스트에 보여지게 올린 후
				list.append("A가 입력 >> " + str + "\n");
				input.setText("");
				// 상대방에게 보내는 처리
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();

					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");

					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);

					socket.send(packet);
					socket.close();

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		setVisible(true);

	}

	public void process() throws Exception {

		while (true) {
			// 상대방이 보낸 텍스트를 소켓으로 받는 부분
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);

			socket.receive(packet);
			list.append("B가 입력 >> " + new String(data) + "\n");

		}

	}

	public static void main(String[] args) {

		try {
			MessengerB m = new MessengerB();
			m.process();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
