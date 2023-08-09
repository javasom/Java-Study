
public class For02 {

	public static void main(String[] args) {
		// 중첩for문
		
		for(int i=1; i<=5; i++) {
			System.out.println("i->"+i);
			for(int j=1; j<=5; i++ ) {
				System.out.println("i="+i+", j="+j);
			}
			System.out.println("i=>"+i);
			
		}

	}

}
