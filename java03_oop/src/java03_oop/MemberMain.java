package java03_oop;
public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member();
		
		Member m2 = new Member(300, "BTS");
		
		System.out.println(m1.num+", "+m2.num);//0, 300
		System.out.println(m1.name+", "+m2.name);//null, BTS
		
		//객체내의 변수의 값 변경하기
		m1.num = 1000;
		m1.name = "블랙핑크";
		System.out.println(m1.num+", "+m2.num);//1000, 300
		System.out.println(m1.name+", "+m2.name);//블랙핑크, BTS
		
		m1.output();
		m2.output();
		
		
		
	}

}
