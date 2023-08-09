package java06_InnerClass;

public class OuterMethodTest {
	String email = "abcd@nate.com";
	public OuterMethodTest() {
		
	}
	public void innerTestMethod() {
		String addr = "서울시 강남구";
		
		//메소드내에 정의하는 내부 클래스
		class MethodInner{
			int num = 2222;
			String username = "홍길동";
			MethodInner(){}
			void Print() {
				System.out.println("번호="+ num);
				System.out.println("이름="+ username);
				System.out.println("주소="+ addr);///메소드 내의 선언한 변수
				System.out.println("이메일="+ email);///외부 멤버 변수
			}
		}
		
		//메소드내의 내부 클래스 반드시 객체 생성
		MethodInner mi = new MethodInner();
		mi.Print();
	}
	///////////////////////////////////////////////////////
	public static void main(String[] args) {
		OuterMethodTest omt = new OuterMethodTest();
		omt.innerTestMethod();

	}

}
