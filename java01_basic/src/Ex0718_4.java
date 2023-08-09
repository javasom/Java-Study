import java.util.Scanner;

public class Ex0718_4 {

	public static void main(String[] args) {
		// 필수 : 삼항연산자 사용하기
		// 과일의 수와 바구니 크기를 입력 받아 필요한 바구니갯수를 구하는 프로그램을 작성하라.
		/*
		 실행
		 과일수=32
		 바구니 크기=10
		 바구니 갯수=4
		 */
	
		int fruit;
		int size;
		int count;
		
		// 과일수, 바구니 크기 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("과일수를 입력하세요. : ");
		fruit = sc.nextInt();
		
		System.out.print("바구니 크기를 입력하세요. : ");
		size = sc.nextInt();
		
		// 필요한 바구니 갯수 구하기
		int quotient = fruit / size;
		int rest = fruit % size;
		count = (rest==0) ? quotient : quotient + 1;
		
		System.out.print("바구니 갯수 : " + count);
	
	}

}
