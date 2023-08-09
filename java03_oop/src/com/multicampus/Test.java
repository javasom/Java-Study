package com.multicampus;

//class Test { // 다른 패키지에서 사용불가
public class Test{
	
	public int num=1234;
	
	public Test() {} //컴파일러가 자동으로 추가 해준다.
	
	void plus(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
}


