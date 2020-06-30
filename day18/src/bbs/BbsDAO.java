package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {

	public void create(BbsBag bag) {
		try {
			System.out.println("게시물 db에 저장처리 됨");
			// db처리
			// 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");
			// db 연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db 연결 성공");

			// SQL 작성
			String sql = "insert into bbs values ( ?, ?, ?, ? )";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());

			System.out.println("3. SQL 작성 성공");

			// SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL 전달 성공");

		} catch (Exception e) {

		}

	}

	public BbsBag read(String id) {

		BbsBag bag = null;

		try {
			System.out.println("게시물 db에 읽기처리 됨");
			// db처리
			// 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");
			// db 연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db 연결 성공");

			// SQL 작성
			String sql = "select * from bbs where id = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. SQL 작성 성공");

			// SQL 전달
			ResultSet rs = ps.executeQuery();
			System.out.println("4. SQL 전달 성공");

			if (rs.next()) { // true

				bag = new BbsBag();

				String id2 = rs.getString(1); // id
				String title = rs.getString(2); // id
				String content = rs.getString(3); // id
				String writer = rs.getString(4); // id

				bag.setId(id2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}

		} catch (Exception e) {

		}
		return bag;

	}

	public void delete(String id) {
		try {
			System.out.println("게시물 db에 삭제처리 됨");
			// db처리
			// 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");
			// db 연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db 연결 성공");

			// SQL 작성
			String sql = "delete from bbs where id = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. SQL 작성 성공");

			// SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL 전달 성공");

		} catch (Exception e) {

		}

	}
}
