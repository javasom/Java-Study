package org.opentutorials.javatutorials.variables;

public class WhyVariable {

	public static void main(String[] args) {
		// 변수를 사용해야 하는 이유
		// 중복의 제거, 가독성up, 유지보수up
		// 고정되는 것과 가변적인 것을 잘 구분하여야 한다.
		
		int a = 100;
		System.out.println(a + 10);
		System.out.println((a+ 10) / 10);
		System.out.println(((a + 10) / 10) - 10);
		System.out.println((((a + 10) / 10) - 10) * 10);

	}

}
