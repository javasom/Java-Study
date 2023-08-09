package java03_oop;

public class SingletonTest {
	//new를 이용하여 객체를 생성할 수 없도록 만든다.
	//static 멤버변수를 이용하여 객체를 중복생성 못하도록 한다.
	private static SingletonTest single = null;
	
	// public, protected, default, private
	// private 접근제한자를 이용하여 외부에서 객체 생성불가로 만들기
	private SingletonTest() {
		
	}
	
	// 객체를 생성하여 리턴해주는 메소드 : getInstance();
	public static SingletonTest getInstance() {
		//객체가 없을 때 객체 생성을 하기
		if(single == null) {
			single = new SingletonTest();
		}
		
		return single;
		
	}
}
