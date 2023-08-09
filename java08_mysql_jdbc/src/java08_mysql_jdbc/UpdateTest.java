package java08_mysql_jdbc;

import java.util.Scanner;

/* 
 * 사원 번호를 입력받아 해당 사원의 업무, 급여, 보너스, 부서 코드를 수정하라.
 */
public class UpdateTest extends DBConnection{
	Scanner sc = new Scanner(System.in);
	public UpdateTest() {
		
	}
	public void updateStart() {
		// 1.데이터 준비
		System.out.print("수정할 사원 번호=");
		int empno = Integer.parseInt(sc.nextLine());
		
		System.out.print("담당 업무=");
		String job = sc.nextLine();
		
		System.out.print("급여=");
		int sal = Integer.parseInt(sc.nextLine());
		
		System.out.print("보너스=");
		int comm = Integer.parseInt(sc.nextLine());
		
		System.out.print("부서 코드=");
		int deptno = Integer.parseInt(sc.nextLine());
		
		try {
			//1. DB연결
			dbConnection();
			
			//2. PreparedStement 객체 생성	 1		2		3		  4				5
			String sql = "update emp set job=?, sal=?, comm=?, deptno=? where empno=?";
			pstmt = con.prepareStatement(sql);
			//값셋팅
			pstmt.setString(1, job);
			pstmt.setInt(2, sal);
			pstmt.setInt(3, comm);
			pstmt.setInt(4, deptno);
			pstmt.setInt(5, empno);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println(result+"개의 레코드가 수정되었습니다.");
			}else {
				System.out.println("사원 정보 수정을 실패하였습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	public static void main(String[] args) {
		new UpdateTest().updateStart();

	}

}
