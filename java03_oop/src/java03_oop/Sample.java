package java03_oop;

import java.util.Scanner;

public class Sample {
	Scanner sc = new Scanner(System.in);
	

	public Sample() {
	}
	
	public Sample (String msg) {
		System.out.println("msg=" +msg);
	}

	// 1. 매개변수 없이 1~100까지 합을 리턴하는 메소드
	public int sum() {
		int tot = 0;
		for(int i=1; i<=100; i++) {
			tot += i;
		}
		return tot;
		
	}
	// 2. 매개변수로 정수형을 받아 1부터 그 수까지 합을 구하여 리턴하는 메소드
	public int sum (int max) {
		int tot =0;
		for(int i=1; i<=max; i++) {
			tot += i;
		}
		return tot;
		
	}
	
	// 3. 매개변수로 정수형을 받아 1부터 그 수까지 홀수의 합을 구하여 출력하는 메소드
	public void oddSum(int max) {
		int tot=0;
		for(int i=1; i<=max; i+=2) {//1,3,5,7,9..max
			tot += i;
		}
		System.out.println("1~"+max+"까지의 홀수의 합은 "+tot);
	}
	// 4. 매개변수로 정수형을 받아 1부터 그 수까지의 짝수의 합을 구하여 리턴하는 메소드
	public int evenSum(int max) {
		int tot = 0;
		for(int i=2; i<=max; i+=2) {//2,4,6,8....max
			tot += i;
		}
		return tot;
	}
	public void allSum(int max) { //SampleMain > s.allSum(10);
		//같은 클래스의 다른 메소드를 호출시 메소드명으로 바로 호출 가능하다.
		System.out.println("1~"+max+"까지의  합은 "+ sum(max));
		oddSum(max);
		System.out.println("1~"+max+"까지의  짝수의 합은 "+ evenSum(max));
	}
	//매소드 : 입력값까지 홀수합과 짝수합을 콘솔에 출력하는 메소드
	public void oeSum(int data) {
		oddSum(data);
		int even = evenSum(data);
		System.out.println("1~"+data+"까지의 짝수의 합은 "+ even);
	}		
}
	
