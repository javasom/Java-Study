
// 1.추상 클래스 상속
public class AbstractMain extends AbstractTest {
	
	public AbstractMain() {
		
	}
// 2. 추상 메소드 오버라이딩하기
	@Override
	public void plus(int i, int j) {
		int r = i+j;
		System.out.println(i+"+"+j+"="+r);
		
	}
	@Override
	public int minus(int x, int y) {
		return 0;
	}
	@Override
	public void multiple() {
			System.out.println("multiple()메소드 실행됨");
	}
	
	
	public static void main(String[] args) {
		//추상클래스는 미완의 메소드가 포함되어 있으므로 객체를 생성할 수 없다.
		//AbstractTest at = new AbstractTest();

		AbstractMain am = new AbstractMain();
		am.method1();
		am.plus(45, 12);
		am.multpie();
	}
	@Override
	public void multpie() {
		// TODO Auto-generated method stub
		
	}
	
		
	}