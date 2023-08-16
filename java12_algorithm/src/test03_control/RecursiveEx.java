package test03_control;

import java.util.Scanner;

public class RecursiveEx {

/*두 수를 입력받아 거듭제곱을 구하는 프로그램을 재귀호출로 작성하라.
 * 
 * [입력]
 * 5
 * 3
 * [출력]
 * 123
 * 
 */
	static int expo(int n, int m) {
		if(m==0) return 1;
		return n * expo(n, m-1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //5
		int m = sc.nextInt(); //3
		
		// 5*5*5
		System.out.println(expo(n,m));
	}
}
