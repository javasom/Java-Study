
public class Operator1 {

	public static void main(String[] args) {
		// 산술연산자 : +, -, *, /, %
		
		int n1 = 14;
		int n2 = 3;
		// 정수 = 정수 / 정수
		// 실수 = 정수 / 실수
		// 실수 = 실수 / 정수
		// 실수 = 실수 / 실수
		
		// 결과변수 = 수식, 상수, 변수	4.766
		int r1 = n1 / n2;
		System.out.println("r1="+ r1);
		
		double r2 = (double)n1 / n2;
		System.out.println("r2="+ r2);
		
		int a =10;
		a = a + 1; // a변수가 1증가하는 수식
		System.out.println("a=" + a);//11
		
		a += 1; // a변수가 1증가하는 수식
		System.out.println("a="+a);//12
		
		//단항연산자(증감연산자)
		//a++;// a변수가 1증가하는 수식
		
		++a; // a변수가 1증가하는 수식
		System.out.println("a="+a);//13
		
		
		a++;
		System.out.println("a+"+a);//14
		
		
		
		int b = a++ + 10; // 
		System.out.println("a="+ a+", b="+b);// 15, 24
		
		
		
		int c = ++a;
		System.out.println("a="+a+" , c="+c);// 16, 16
		
		int d = a--; // a=15, d=16
		System.out.println("a=" + a + " , d="+d);
		
		//대입연산자 : =, +=, -=, /=, %=.....
		int x = 5;
		//x = x + 10 / 3 * 4;
		x += 10 / 3 * 4;
		System.out.println("x="+ x);// 17
		
		int y = 10;
		y = y * 2 % 3 + 7 / 3;
		//y *= 2 % 3 + 7 / 3; // X
		System.out.println("y="+ y);// 4
		
		int z = 11;
		//y *= 2 % 3 + 7 / 3; // X
		System.out.println("z>>1="+ (z>>1) );
		System.out.println("asdasda"+ (((z>>1))<<1) );// 4
	}
}
