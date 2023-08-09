import java.util.Scanner;

public class Ex0718_2 {

	public static void main(String[] args) {
		// 정수를 입력받아 일의 자리의 값을 1로 바꾸는 프로그램을 작성하라.
		/*
		 실행
		 정수=235
		 결과=231
		 */
		
		int input;
		int result;
		
		// input에 입력받은 값을 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		input = sc.nextInt();
		
		// input에 일의 자리의 값을 1로 바꾸고 result에 저장
		result = ((input/10)*10)+1;
		System.out.print("결과 : " + result);
	
		
	}
}
