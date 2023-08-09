import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		// if else문 사용하기
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 메뉴를 선택 (1.사각형의 넓이, 2.원의 넓이)?");
		int menu = s.nextInt();
		
		if(menu == 1) {//사각형의 넓이
			System.out.println("가로(밑변)=");
			int w = s.nextInt();
			System.out.println("세로(높이)=");
			int h =s.nextInt();
			int area = w*h;
			System.out.printf("사각형의 넓이=%d\n",(area));
		}else {//원의 넓이
			System.out.println("반지름=");
			int r = s.nextInt();
			double area = r*r*3.14;
			System.out.printf("원의 넓이=%f",(area));
	
		}
	}
}

/*
사격형의 넓이 = 가로 * 세로
원의 넓이 = 반지름 * 반지름 * 3.14

실행결과
원하는 메뉴를 선택(1. 사각형의 넓이, 2. 원의 넓이)?1
가로(밑변)=
세로(높이)=
사각형의 넓이 =


원하는 메뉴를 선택(1. 사각형의 넓이, 2. 원의 넓이)?2
반지름=
원의 넓이=

*/