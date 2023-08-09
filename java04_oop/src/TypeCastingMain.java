
public class TypeCastingMain {

	public static void main(String[] args) {
		Child c= new Child();
		System.out.println("c.num="+ c.num+", c.username="+ c.username+", c.age="+c.age);
		
		//상속관계에서 하위 클래스 객체를 상위클래스 객체로 대입을 하면 자동형변환이 된다.
		Parent p = new Child();
		System.out.println("p.num="+ p.num+", p.username="+ p.username);		//하위 클래스의 변수 상위가 없어 숨김 처리됨.
		//System.out.println("p.num="+ p.num+", p.username="+ p.username+", p.age="+p.age);
		
		//	int a=10; double b = a; int c = (int)b;
		
		//상위 클래스 타입의 instance를 하위 클래스 타입으로 대입하기 위해서는 강제 형변환이 필요하다.
		Child c2= (Child)p;
		System.out.println("c2.num="+ c2.num+", c2.username="+ c2.username+", c2.age="+c2.age);
		
		
//		Parent pp = new Parent();
//		Child cc = (Child)pp; //상위 클래스로 객체 생성 후 하위 클래스로 형변환은 할 수 없다.
//		System.out.println(cc.age);
		
		String str = new String("형변환 연습 중");
		Object obj = new String("상속과 관계가 있다.");
		Object cObj = new Child();
		
		System.out.println(str);
		System.out.println(obj);
		System.out.println(cObj);
				
		System.out.println("------------------------------------------");
		
		Child mc = new Child();
		mc.numOutput(); //num=100
		mc.nameOutput();//이름=sunsin
		mc.output();//100,sunsin
		
		System.out.println("------------------------------------------");
		
		Parent mp = mc;//자동형변환
		mp.numOutput();
		//mp. output();//하위 클래스를 상위 클래스로 대입하면 하위에만 있는 메소드는 숨겨진다.
		//오버라이딩 메소드는 하위->상위로 형변환하더라도 오버라이딩한 기능이 유지된다.
		mp.nameOutput();
		
		System.out.println("------------------------------------------");
		
		//상위 클래스형으로 변환된 객체를 다시 하위 클래스로 대입시 강제 형변환하여야 한다.
		Child mc2 = (Child)mp;
		mc2.numOutput();
		mc2.nameOutput();
		mc2.output();
		
	}
}
