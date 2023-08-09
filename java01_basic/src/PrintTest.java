
public class PrintTest {

	public static void main(String[] args) {
		//출력문(콘솔)
		// println() : 한줄을 출력 후 줄바꿈
		// print() : 문자를 출력 후 줄바꿈하지 않는다.
		// printf() : 데이터 출력 시 패턴을 설정하여 출력한다.
		
		//제어문자 : \", \', \n-> newline, \t->tab키처럼 8칸 건너뜀
		
		System.out.println("println()\"메소드\'를 \n이용한 \t출력문"+100);
		System.out.println(200);
		
		System.out.print("여러번");
		System.out.print("출력문을");
		System.out.print("실행하더라도");
		System.out.println("한줄에 출력된다.");
		
		double num = 10/3.;
		System.out.println(num);
		
		// printf()메소드는 format을 이용하여 자릿수를 설정할 수 있다. 줄바꿈 기능이 없으며, \n를 이용하여 줄바꿈한다.
		
		// printf("출력포멧형식", 변수,변수,변수,........);
		// 			%d, %8d		-> 정수, 자릿수
		//			%f, %8.2f	-> 실수 %총자릿수.소수이하자릿수f
		//			%s, %10s	-> 문자열
		//			%c,		 	-> char
		//			%o			-> 8진수
		//			%x			-> 16진수
		int x = 1234;
		int y = 20; 
		System.out.printf("x의 값은 %d\n", x);
		System.out.printf("y의 값은 %10d\n", y);
		
		System.out.printf("x=%5d, y=%-5d\n", x, y); // - 빈자리를 오른쪽에
		
		System.out.printf("num=%f, num=%-8.2f\n", num, num);
		
		String name = "홍길동";
		String lastName = "gildong";
		System.out.printf("str=%s, str=%10s\n" , name, lastName);
		
	}

}
