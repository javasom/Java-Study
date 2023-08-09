import java.util.Scanner;

public class Ex0718_1 {

	public static void main(String[] args) {
		// 정수를 입력받아 백의 자리 이하를 버리는 프로그램을 작성하라.
		/*
		 실행
		 정수=456
		 결과=400
		 
		 */
		int input;
		int result;
		
		// input에 입력받은 숫자를 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		input = sc.nextInt();
		
		// input에 백자리 이하 제거한 값을 result에 저장
		result = (input/100) * 100;
		System.out.print("결과 : " + result);
		
		
	}
}


