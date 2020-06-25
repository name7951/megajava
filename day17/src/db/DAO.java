package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {

	public void insert(String id, String pw, String name, String tel) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK");

		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 OK");

		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); // SQL문을 담당하는 클래스로
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. SQL 생성 OK");

		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK");

		ps.close();
		con.close();
		
	}

	public void delete(String id) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK");

		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 OK");

		String sql = "delete from member where id = ? ";
		PreparedStatement ps = con.prepareStatement(sql); // SQL문을 담당하는 클래스로
		ps.setString(1, id);

		System.out.println("3. SQL 생성 OK");

		ps.executeUpdate();
		System.out.println("4. SQL 전송 OK");

	}

}
