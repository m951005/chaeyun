package dao;

import java.sql.*;

public class ConnectionManager {
	private static Connection connection;
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "jdbcmember";
	private static final String PASSWORD = "1234"; 
	
	// 드라이버 로딩
	static {
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch(SQLException e) {
			System.out.println("데이터베이스 접속 실패");
		}
		
		return connection;
	}

}
