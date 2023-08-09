package java03_oop;

public class SingletonMain {

	public SingletonMain() {
		// TODO Auto-generated constructor stub
	}
	/////////////////////////////////////////////////
	public static void main(String[] args) {
		//생성자가 private이므로 객체 생성불가
		//SingletonTest st = new SingletonTest();

		//객체명.멤버변수 접근불가
		//SingletonTest.single
		
		SingletonTest st = SingletonTest.getInstance(); //500번지
		SingletonTest st2 = SingletonTest.getInstance();//500번지
		
		System.out.println(st); 
		System.out.println(st2);
		
		Member m1 = new Member(); // 1000번지
		Member m2 = new Member(); // 2000번지
		System.out.println(m1);
		System.out.println(m2);
	}
}
