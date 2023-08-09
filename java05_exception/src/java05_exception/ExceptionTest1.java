package java05_exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {
		// 두 수를 입력받아 합을 출력하라.
		
		Scanner sc = new Scanner(System.in);
		try {// ===try문 : 예외발생가능코드, 정상코드를 기술한다.
			
			System.out.print("첫 번째 정수= ");//  "12.6" "abc"
			int n1= sc.nextInt(); // InputMismatchException 
							  // 문자열을 정수로 변환하여야 하는데 정수로 바꿀 수 없는 문자
							  // Integer.parseInt(sc.nextLine());	"12.6"	
			System.out.print("두 번째 정수= ");
			int n2= sc.nextInt();
			
			int hap = n1 + n2;
			System.out.println("n1+n2= "+ hap);
			
			int divide = hap/n2; //  15/0 프로그램에서는 어떤 수를 0으로 나눌 수 없다. 
								 //ArithmeticException
			System.out.println("hqp/n2= "+ divide);
			
			int[] arr = new int[4]; // arr[0], arr[1], arr[2], arr[3]	arr.length=4
			arr[arr.length-1] = 120;  // ArrayIndexOutOfBoundsException
			System.out.println(Arrays.toString(arr));
		} catch(InputMismatchException ime) { // 해당 예외가 발생하면 실행할 catch문
			System.out.println("정수를 입력하여야 합니다.");
			System.out.println(ime.getMessage());
			ime.printStackTrace();
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("index를 잘못 사용하였습니다.");
			System.out.println(aioobe.getMessage());
			aioobe.printStackTrace();
		} finally {// try문 코드가 예외 발생하든 안 하든 무조건 실행되는 영역
			System.out.println("finally는 무조건 실행 됨.");
	}
			
}
		
	public static void main(String[] args) {
		new ExceptionTest1();
	
	}

}
