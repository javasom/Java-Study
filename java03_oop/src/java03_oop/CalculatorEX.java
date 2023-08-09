package java03_oop;

import java.util.Scanner;

public class CalculatorEX {
	Scanner sc = new Scanner(System.in);
	public CalculatorEX() {}
	

// 메소드
//값 입력받기
	public int input(String msg) {// msg값은 외부 메소드 내로 전달
		System.out.print(msg+"=");
		return sc.nextInt();
	}
	
//더하기
	public int plus(int a, int b) {
		return a+b;
	}
//빼기
	public int minus(int a, int b) {
		return a-b;
	}
//곱하기
	public int multiple(int a, int b) {
		return a*b;
	}
//나누기
	public double divide(int a, int b) {
		return a/(double)b;
	}
//모든 사칙 연산 결과가 구해지는
	public void allCal(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/(double)b));
	}

	public static void main(String args[]) {
		CalculatorEX cal = new CalculatorEX();
		int x = cal.input("첫 번째 수 ");
		int y = cal.input("두 번째 수 ");
		
//		int result = cal.plus(x, y);
		int result = cal.minus(x, y);
		System.out.println(result);
		
		cal.allCal(x, y);
		
	}
}
