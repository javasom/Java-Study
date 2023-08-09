import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		// while, do~while 중 선택

		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수=");
		int data = sc.nextInt();
		
		int sum=0; //합을 누적시킬 변수
		int i=0;   //1씩 증가시킬 변수
		
		do {
			i++;
			sum += i;
			
			//확인
			if(sum>=data) {
				//결과 출력
				System.out.printf("1~%d까지의 합은 %d\n", i, sum);
				//반복문 중지
				break;		
			}
		}while(true);
			
	}

}


/*
임의의 정수를 입력받아 1부터 합을 구하여, 얼마까지 합을 구하면 최초로 입력받은 값을 초과하는지

1+2+3+4  +5 +6 +....
  3 6 10 16 21
실행
임의의 정수=25326
1~__까지의 합은 25425이다.


*/