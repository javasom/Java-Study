import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		// 두 수를 입력받아 두 수 모두 양수일 때는 합차곱몫을 구하라.
		/*
		실행
		첫 번째 수 = 10
		두 번째 수 = 3
		10 + 3 = 13
		10 - 3 = 7
		10 * 3 = 30
		10 / 3 = 3

		실행
		첫 번째 수 = 10
		두 번째 수 =-15


		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수 = ");
		int num = Integer.parseInt(scan.nextLine());
		System.out.print("두 번째 수 = ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		if (num>0 && num2>0) {
			System.out.printf("%d + %d = %d\n ", num, num2, num+num2);
			System.out.printf("%d - %d = %d\n ", num, num2, num-num2);
			System.out.printf("%d * %d = %d\n ", num, num2, num*num2);
			System.out.printf("%d / %d = %d\n ", num, num2, num/num2);
		}
		System.out.print("End");
	}
}
