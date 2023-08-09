package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		//실수		실수
		float a0 = 2.2F;
		
		
		//int a = 2147483647;
		long a1 = 2147483648L;
		byte b0 = 100;
		// 		int형이다. 범위 안에서는 허용
		short c0 = 200;
		
		
		
		//자동 형 변환
		// byte -> short 
		//				-> int ->long ->float -> double
		//		   char
		
		/*
		 * byte 타입은 short가 될 수 있지만 short는 byte 타입이 될 수 없다. 
		 * long은 float가 될 수 있지만, float는 long이 될 수 없다.
		 * 자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용된다는 것이다.
		 * char -> int 가능 , int -> char 불가능
		 */
		
		int a2 = 3;
		float b1 = 1.0F;
		double c1 = a2 + b1; // int + float , 정수 -> 실수 가능
							 // float 변환, 3.0F + 1.0F
		
		System.out.println(a2 + b1); // 최종적으로 더블형 타입
		
		
		//명시적 형 변환

		//float a = 100.0;	double은 float로 자동 형변환 불가
		//int b = 100.0F;	실수는 정수로 자동 형변환 불가
		
		float a3 = (float)100.0;
		int b2 = (int)100.0F; // 100.1F -> 100
		
		//괄호 안에 데이터 타입을 지정해서 값 앞에 위치시키는 것을 명시적인 형 변환이라고 부른다.
	}

}
