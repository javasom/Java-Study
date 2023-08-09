package java08_mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	Connection con = null;
	PreparedStatement pstmt = null;
	public InsertTest() {
	}
	public void start() {
		Scanner sc = new Scanner(System.in);
		// 콘솔에서 사원 번호, 이름, 업무, 입사일(현재 날짜, 시간)급여를 입력받아 DB에 추가하기
		System.out.print("사원 번호->");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("사원명->");
		String ename = sc.nextLine();
		System.out.print("담당업무->");
		String job = sc.nextLine();
		System.out.print("급여->");
		int sal = Integer.parseInt(sc.nextLine());
		
			// 1. jdbc 드라이브 로딩
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		}catch(ClassNotFoundException cnfe){
			System.out.println("드라이브 로딩 실패..."+ cnfe.getMessage());
		}
		
		try {
			// 2. db 연결
			String url = "jdbc:mysql://localhost/mydb";
			String username = "root";
			String password = "tiger1234";
			con = DriverManager.getConnection(url, username, password);
			
			// 3. 쿼리문 -> PreparedStatement 생성
			String sql = "insert into emp(empno, ename, job, hiredate, sal) values(?,?,?,now(),?)";
			pstmt = con.prepareStatement(sql);
			// ?가 있는 쿼리문은 값을 셋팅해야 한다.
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, sal);
			
			// 4. 실행	insert한 레코드 수 반환
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("사원이 등록되었습니다.");
			}else {
				System.out.println("사원 등록이 실패하였습니다.");
			}
			
		}catch(SQLException se) {
			System.out.println("DB 연결 실패..."+ se.getMessage());
		}finally {
			try {
			//DB닫기
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
			}catch(SQLException s) {
				System.out.println("닫기 예외 발생..."+ s.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		new InsertTest().start();
	}
}
