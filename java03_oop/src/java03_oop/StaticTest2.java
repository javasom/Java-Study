package java03_oop;

public class StaticTest2 {
	int  bun = 12;
	static String name = "홍길동";
	
	// 매개변수가 없는 생성자는 컴파일러 컴파일 시 생성해 준다.
	// 매개변수가 있는 생성자가 있을 때는 컴파일러가 만들어 주지 않는다.
	public StaticTest2() {}
	public StaticTest2(int bun) {
		this.bun = bun;
	}
	
	public String gugudan(int dan) {
		String result = "";
		for(int i=2; i<=9; i+=1) {
			result += dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
	
	public static String dan(int dan) {
		String result = "";
		for(int i=2; i<=9; i+=1) {
			result += dan+"단*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
	

	public static void main(String[] args) {
//		System.out.println("bun->"+ bun);	// bun멤버변수가 static변수가 아니므로 객체를 생성하여야 사용이 가능하다.
		StaticTest2 st = new StaticTest2();
		System.out.println("st.bun->"+ st.bun);
		System.out.println("name->"+ name);	// StaticTest2.name

		//gugudan(5); // satatic이 없는 매소드 현재 클래스를 객체로 만들고 객체명, 매소드명으로 호출해야 한다.
		System.out.println(dan(6));
	}

}
