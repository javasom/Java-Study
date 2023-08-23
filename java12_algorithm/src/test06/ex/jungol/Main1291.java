package test06.ex.jungol;

import java.util.Scanner;

public class Main1291 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		while((s < 2 || s > 9) || (e < 2 || e > 9)) {
			System.out.println("INPUT ERROR!");
			s = sc.nextInt();
			e = sc.nextInt();
		}
		if(s < e) {
			for(int i=1; i<=9; i++) {
				for(int j=s; j <=e; j++) {
					System.out.printf("%d * %d = %2d   ", j,i,(j*i));
				}
				System.out.println();
			}
		}else {
			for(int i=1; i<=9; i++) {
				for(int j=s; j >=e; j--) {
					System.out.printf("%d * %d = %2d   ", j,i,(j*i));
				}
				System.out.println();
			}
		}
	}
}
