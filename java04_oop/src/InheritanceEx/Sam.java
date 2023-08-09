package InheritanceEx;
class Test {
	//protected static int add(int a, int b) {
	protected int add(int a, int b) {
		return a+b;
	}

}


class Ex extends Test{
	//protected static int add(int a, int b) {
		protected int add(int a, int b) {
		int x = super.add(10,5);
		return x;
	}
	

}
public class Sam {
		
	public static void main(String[] args) {
		//System.out.println(Ex.add(10, 5));
		Ex ex= new Ex();
		System.out.println(ex.add(10, 5));
	}

}
