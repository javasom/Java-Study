
//			B클래스는 A클래스를 상속받았다.
public class B extends A{

	//멤버변수
	String book = "HTML";
	//생성자메소드
	public B() {
		//상위 클래스의 생성자 중에 매개변수가 있는 생성자를 실행할 경우
		// super 키워드를 이용하여 상위 클래스의 생성자를 호출해준다.
		// 첫 번째 실행문으로 표기하여야 한다.
		// this() : 같은 클래스의 다른 생성자 호출
		// super() : 상위 클래스의 다른 생성자 호출
		super("사과");
		
		System.out.println("B클래스의 생성자 메소드 실행 됨...");
		// 상위 클래스와 하위 클래스에서 같은 필드명일 때 현재 클래스의 변수를 접근한다.
		//super.멤버변수는 상위 클래스의 변수이다.
		System.out.println(isbn+"===="+ book+"===="+ super.book);
		
		// 현재 클래스 없는 변수는 this를 표기하더라도 상위 클래스의 변수에 접근한다.
		// 상위 클래스는 하위 클래스의 어떤 기능도 사용할 수 없다.
		System.out.println(this.isbn+"====>"+ super.isbn);
		
		//상위 클래스의 변수,메소드는 private접근제한자일 때 상속하지 않는다.
		//System.out.println("author="+ super.author);
		
		//상위 클래스 메소드 호출
		method1();
		inherTest(10);
		
		// private 메소드는 상속이 안 됨.
		//sum();
		sum(10);
		
		//오버라이딩 : 같은 메소드가 존재
		super.sum(20);
		
	}
	//메소드
	public void inherTest(int max) {
		int tot=0;
		for(int i=1; i<=max; i++) {
			tot += i;
		}
		System.out.println("1~"+max+"까지의 합은 "+tot);
	}
	
	//오버라이딩(override) : 상위 클래스의 메소드를 하위 클래스에서 재정의
	public void method1() {
		System.out.println(isbn +"-----"+ book);
	}
	// public > protected > default > private
	// 메소드 오버라이딩 시 접근제한자는 상위 클래스의 접근제한자보다 사용범위가 작아지면 안 됨.
	//						   넓은 범위로는 오버라이딩을 할 수 있다.
	// public -> default 불가
	// default -> public 가능
	@Override
	 public void sum(int max) {
		int tot=0;
		for(int i=2; i<=max; i+=2) {
			tot += i;
		}
		System.out.println("1~"+max+"까지의 짝수의 합은 "+ tot);
	}
}
