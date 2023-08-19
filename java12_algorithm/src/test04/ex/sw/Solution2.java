package test04.ex.sw;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//테스트 케이스를 입력받을 변수
		int t =sc.nextInt();
		
		for(int i=1; i<=t; i++) {		//테스트 케이스만큼 반복해서 입력을 받음
			int sum = 0;				//숫자들의 합을 저장할 변수
			for(int j=1; j<=10; j++) {	//하나의 케이스마다 10개씩 입력받게 함
				int num = sc.nextInt(); //숫자들을 입력받고
				if(num%2==1) {			//숫자들이 홀수인지 판별
					sum+=num;			//홀수이면 sum에 num을 계속 저장함
				}					
			}
			System.out.printf("#" +i+ " "+sum+"\n");
		}

	}
}

/*
10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력하는 프로그램을 작성하라.


[제약 사항]

각 수는 0 이상 10000 이하의 정수이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.


[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

입력
3
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1   
 
출력
#1 200
#2 208
#3 121
 

*/