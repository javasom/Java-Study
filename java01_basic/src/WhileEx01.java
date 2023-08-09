import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		// 콘솔에서 숫자를 입력받아 그 수까지의 홀수합, 짝수합을 구하라. 
		// 단, 반복문은 while문으로 사용한다.
		/*
	 		실행
	 		정수=10
	 		홀수합=25
	 		짝수합=30
		 */
	
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("정수=");
		int num = sc.nextInt();
		
		
	
		int i=1;
		int even=0; //짝수의 합
		int odd =0; //홀수의 합
		
		
		while(i <= num   ) {
			if(i%2==1) {
				odd = odd + i;  //홀수의 합
			}else {
				even = even + i;//짝수의 합
			}
			i++;//i의 증가식 - 다음수 수 만들기
		
		}
		//출력문
		System.out.println("홀수의 합=" +odd);
		System.out.println("짝수의 합=" +even);
		}
	}
}