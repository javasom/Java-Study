package java05_exception;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTest2 {
	Scanner sc = new Scanner(System.in);
	
	public ExceptionTest2() {
		
	}
	public void start() {
		try {
			System.out.print("첫 번째 정수= ");
			int n1= sc.nextInt();	 //InputmismatchException ->잘못된 정보입니다.
							  
			System.out.print("두 번째 정수= ");
			int n2= sc.nextInt();	 //InputmismatchException 
			
			int hap = n1 + n2;
			System.out.println("n1+n2= "+ hap);
			
			int divide = hap/n2;	 //ArithmeticException -> 0으로 나눌 수 없다.
			System.out.println("hqp/n2= "+ divide);
			
			int[] arr = new int[4]; 
			arr[arr.length] = 120; //ArrayIndexOutofBonundsException ->잘못된 정보입니다.
			System.out.println(Arrays.toString(arr));
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally 무조건 실행");
		}
	}
	public static void main(String[] args) {
		new ExceptionTest2().start();

	}

}
