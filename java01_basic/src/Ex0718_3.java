import java.util.Scanner;

public class Ex0718_3 {

	public static void main(String[] args) {
		// 문자형 값 대문자를 입력받아 소문자로 바꾸는 프로그램을 작성하라.
		/*
		 실행
		 문자=A
		 결과=a
		 
		 */

		String input;
		String result;
		
		// input에 입력받은 값을 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("대문자 입력 : ");
		input = sc.next();
		
		// input에 입력한 대문자를 result에 소문자로 전환
		result = input.toLowerCase();
		System.out.print("결과 : " +result);
		
		
	}

}
