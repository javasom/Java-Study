//추상 클래스는 추상 메소드를 1개 이상 포함하고 있는 클래스이다.
//추상 메소드를 포함하고 있는 클래스는 class키워드 왼쪽에 abstract를 표기하혀야 한다.
//추상 클래스는 사용할 때 반드시 상속을 받아야 하며, 모든 추상 메소드를 오버라이딩을 하여야 한다.
public abstract class AbstractTest extends AbstractSuper{

	public AbstractTest() {
		
	}
	public void method1() {
		System.out.println("method1() 실행됨");
	}

	//추상 메소드
	// 반환형, 메소드명, 매개변수를 정의하고 실행부가 없는 메소드를 추상 메소드라고 한다.
	// 추상 메소드는 반환형 이전에 abstract 키워드를 기술해야 한다.
	public abstract void plus(int a, int b); 
	public abstract int minus(int x, int y);
	
	
}
