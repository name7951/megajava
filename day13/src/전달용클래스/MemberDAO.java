package 전달용클래스;

// Data Access Object(DAO)
// 데이터 베이스 처리 클래스
public class MemberDAO {
	// db에 넣는 처리 구현
	public void insert(MemberDTO bag) {
		// db 접속, 저장
		System.out.println();
		System.out.println("db에 접속");
		System.out.println("저장된 id : " + bag.getId());
		System.out.println("저장된 비밀번호 : " + bag.getPw());
		System.out.println("저장된 이름 : " + bag.getName());
		System.out.println("저장된 전화번호 : " + bag.getTel());
		
		System.out.println("db에 저장");

	}

}
