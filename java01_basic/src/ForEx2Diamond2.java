import java.util.Scanner;

public class ForEx2Diamond2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 홀수 입력=");
		int max = sc.nextInt();
		//홀수가 아닌 경우
		if(max%2==0) max++; 
		//문자
		char c = 'A';
		int step = 2;
		
		//삼각형
		for(int i=1; i>=1; i+=step) { // 1 3 5 7 9 11
			for(int s=1; s<= (max-i)/2; s++) {// 공백
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {// 1
				System.out.print(c++);
				if(c>'Z') c='A';
			}
				System.out.println();
				if(i>=max) step-=2;
		}
		//역삼각형
		/*for(int i=max-2; i>=1; i-=2) { // 9 7 5 3 1
			for(int s=1; s<=(max-i)/2; s++) {
				System.out.print(" ");
		}
			for(int j=1; j<=i; j++) {
				System.out.print(c++);
				if(c> 'Z') c= 'A';
			}
			System.out.println();
	}*/

	}
}
