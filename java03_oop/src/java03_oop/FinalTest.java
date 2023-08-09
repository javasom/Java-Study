package java03_oop;

public class FinalTest {
	// final 키워드
	//		 멤버변수, class, method에 표기할 수 있다.
	//		 멤버변수는 초기값이 설정되면 더 이상 값을 변경할 수 없다. 상수화 된 변수
	//		 메소드는 반환형 이전에 기술하고 상속 시 오버라이딩이 불가능하다.
	//		 클래스는 class키워드 이전에 기술하고 상속해 주지 않는다.
	
	// final 변수는 모두 대문자로 만든다.
	//			  합성어일 때는 각 단어를 _로 구분한다.
	
	final int NUM = 10;
//	final int age;
	final String USER_NAME = "세종대왕";
	
	static final String ADDR = "서울시 강남구";
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();

		System.out.println(ft.NUM+", "+ ft.USER_NAME);
		
//		ft.NUM = 100; // final 변수는 값을 변경할 수 없다.
		System.out.println(FinalTest.ADDR);
		System.out.println(ADDR);
		
		
	}

}
