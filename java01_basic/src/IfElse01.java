import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		// 정수를 입력받아 0보다 크면 100을 곱한 값을 출력하고
		//			  0보다 작으면 양수로 만들어 100을 곱하여 출력하라.
		
		/*
		 if(조건식){
		 	참일 때 실행문;
		 }else{
		 	거짓일 때 실행문;
		 }
		  
		 */

		System.out.print("정수입력=");
		int num = s.nextInt();
		int result;
		
		if(num>0) {//양수
			result = num * 100;
			System.out.println("result="+ result);
			
		}else {//0, 음수
			if(num==0) {
			}else {	
			}
			result = -num * 100;
		}
			
			System.out.println("result="+ result);
		}
	

	}
