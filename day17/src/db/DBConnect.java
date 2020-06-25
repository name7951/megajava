package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBConnect {

	public static void main(String[] args) throws Exception {
		// 1~3 - google myBatis
		// 1.����̹�(Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK");

		// 2.db����(shop, root, password)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� OK");

		// 3.SQL�� ����
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");

		String sql = "insert into member values (?,?,?,?)";
//		String sql = "delete from member where id = '700'"; 
		PreparedStatement ps = con.prepareStatement(sql); // SQL���� ����ϴ� Ŭ������
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. SQL ���� OK");

		// 4.SQL�� ����
		ps.executeUpdate();
		System.out.println("4. SQL ���� OK");

	}

}
