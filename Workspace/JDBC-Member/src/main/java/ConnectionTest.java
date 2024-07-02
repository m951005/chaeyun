import java.sql.*;


public class ConnectionTest {
	public static void main(String[] args) {
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// Connection : 데이터베이스 접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	// '@'앞 부분은 고정값
			String user = "jdbcmember";
			String password = "1234";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 접속 성공");
			
			// PreparedStatement, Statement: SQL 실행
//			String sql = "insert into member (id, name, gender, birth, email)"
//					+ " values(seq_member.nextval, 'user2', 'FEMALE', '1990-10-02', 'user2@gmail.com')";
//			PreparedStatement pstmt = connection.prepareStatement(sql);
//			int result = pstmt.executeUpdate();		// -> insert, delete, update
//			System.out.println("result: " + result);
			
			String sql = "select * from member";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();		// -> select
			
			while(rs.next()) {							// rs.next() -> 커서를 옮김
				System.out.println(rs.getLong("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("gender"));
				System.out.println(rs.getString("birth"));
				System.out.println(rs.getString("email"));
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 접속 실패");
			System.out.println(e.getMessage());
		}
	}

}
