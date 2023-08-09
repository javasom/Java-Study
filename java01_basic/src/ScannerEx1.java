import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// ctrl+space를 이용하여 import하기
		Scanner scan = new Scanner(System.in);
		// 콘솔에서 숫자를 입력받아 짝수와 홀수를 구별하여 출력하라.
		/*
		 실행
		 숫자=16
		 16은 짝수입니다.
		 
		 
		 숫자=15
		 15는 홀수입니다.		 
		 */
		
		
		System.out.print("숫자->");
		int num = scan.nextInt();
		
		String result = (  num%2 == 1  )? "홀수" : "짝수" ;
		//String result = (  num%2 == 0  )? "짝수" : "홀수" ;
		
		System.out.printf("%d은 %s입니다.\n", num, result);
	}

}
