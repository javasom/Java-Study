package java03_oop;


public class Member {
	int num;// 초기값 0
	String name;// 초기값 null ->BTS
	
	public Member() {
		System.out.println("Member()생성자 메소드 실행됨...");
	}
	public Member(int num) { // new Member(100)
		this();
		//this : 현재 클래스의 전역변수 num을 지정한다.
		this.num = num;
	}
	public Member(String name) {
		
	}
	public Member(int num, String name) { // new Member(200,"BTS");
		//this.num = num;
		//생성자 메소드에서 다른 생성자 메소드를 호출하는 방법은 this()
		//반듣시 첫 번째 실행문으로 표기하여야 한다.
		this(num);
		this.name = name;
	}
	public void output() {
		System.out.println(num+"->"+name);
	}
	
	
}
