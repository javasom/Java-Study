package java03_oop;

public class ClassTestMain {
	public ClassTestMain() {}
	public static void main(String[] args) {
	//객체생성
	ClassTest ct1 = new ClassTest();
//	ClassTest ct2 = new ClassTest(100);
//	ClassTest ct3 = new ClassTest("RED");
//	ClassTest ct4 = new ClassTest(200, "PINK");
	
	//객체내의 메소드를 호출하여 기능을 실행한다.
	//	객체명.메소드명()
	int returnValue = ct1.getNum();//6234
	System.out.println("returnValue->"+ returnValue);
	int returnValue2 = ct1.getNum();//11234
	System.out.println("returnValue2->"+ returnValue2);
	
	ct1.setName(); //반환형이 없는 (void) 리턴값이 없으므로 변수에 대입할 수 없다.
	
	int returnValue3 = ct1.getNum(10000);
	System.out.println("returnValue3->"+ returnValue3); //21234
	
	//객체내의 멤버변수를 사용하기
	System.out.println("ct1.name="+ ct1.name);//이순신
	
	//콘솔에서 값입력 받기
	String str = ct1.scan.nextLine();
	System.out.println("str=" +str);
	
	
	}
}
