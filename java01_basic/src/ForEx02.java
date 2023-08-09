import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력받는 정수
		
		System.out.print("정수 입력 >");
		int num = sc.nextInt();
		
		int tot = 0;	
		int odd = 0;	
		int even = 0;	
		
		
		for (int i=1; i<=num; i++) { // 1,2,3,4,5.....
			
			//전체합
			tot = + i; // tot += i;
			
			//홀수합
			if(i%2==1)
				odd += i; // odd = odd + i;
			
			//짝수합
			else
				even += i;
			
					
		}
		
		System.out.printf("1~%d까지의 홀수의 합은 %d\n", num, odd);
		System.out.printf("1~%d까지의 짝수의 합은 %d\n", num, even);
		System.out.printf("1~%d까지의 전체의 합은 %d\n", num, tot);
		
	}
		
}





/*
 정수를 입력받아 입력받은 값까지 짝수의 합, 홀수의 합, 전체 합을 구하라.
 
 실행
 정수=10
 1~10까지의 홀수의 합은?
 1~10까지의 짝수의 합은?
 1~10까지의 합은?*

*/