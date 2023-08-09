package java08_mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {

	protected Connection con = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	String url =  "jdbc:mysql://localhost/mydb";
	String username = "root";
	String password = "tiger1234";
	
	static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(ClassNotFoundException snfe) {
				System.out.println("드라이브 로딩 예외 발생");
			}
	}
	public DBConnection() {
		
	}
	//DB연결
	public void dbConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			System.out.println("DB 연결 예외 발생..."+ e.getMessage());
		}
	}
	//DB닫기
	public void dbClose() {
		try {
			if(rs !=null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		}catch(Exception e) {
			System.out.println("DB 닫기 예외 발생..."+ e.getMessage());
		}
	}
}
