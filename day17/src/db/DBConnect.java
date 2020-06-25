package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBConnect {

	public static void main(String[] args) throws Exception {
		// 1~3 - google myBatis
		// 1.드라이버(커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK");

		// 2.db연결(shop, root, password)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 OK");

		// 3.SQL문 생성
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");

		String sql = "insert into member values (?,?,?,?)";
//		String sql = "delete from member where id = '700'"; 
		PreparedStatement ps = con.prepareStatement(sql); // SQL문을 담당하는 클래스로
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. SQL 생성 OK");

		// 4.SQL문 전송
		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK");

	}

}
