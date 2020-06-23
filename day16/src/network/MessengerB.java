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
	// �������� ����
	JTextArea list;
	JTextField input;
	DatagramSocket socket;

	public MessengerB() throws Exception {

		socket = new DatagramSocket(6000);

		setTitle("Messenger B");

		list = new JTextArea(15, 20); // 6�ٿ� 20���� ��
		input = new JTextField();

		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		pack();

		list.setEditable(false);

		list.setBackground(Color.BLACK);
		list.setForeground(Color.LIGHT_GRAY);
		input.setBackground(Color.red);
		input.setForeground(Color.black);

		Font font = new Font("����", Font.BOLD, 20);

		list.setFont(font);
		input.setFont(font);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �Է��� ���� ������ �;� ��
				String str = input.getText();
				// ����Ʈ�� �������� �ø� ��
				list.append("A�� �Է� >> " + str + "\n");
				input.setText("");
				// ���濡�� ������ ó��
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
			// ������ ���� �ؽ�Ʈ�� �������� �޴� �κ�
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);

			socket.receive(packet);
			list.append("B�� �Է� >> " + new String(data) + "\n");

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
