
public class BreakTest01 {

	public static void main(String[] args) {
		// break문
		// break문은 반복문(for, while, do~while)을 제어하는 역할

		for(int i=1;  ;i++) {
			System.out.println("i="+i);
			
			if(i>10) {
				break;
				
				
			}
		}
		System.out.println("반복문이 중지 되었습니다.");
		
		for(int i=1; i<=10; i++) { //1,2,3,4,5.....10
			
			for(int j=1; j<=10; j++) {
				
				System.out.println("i="+i+", j="+j);
				
				if(j==5) {
					break; // break가 포함된 반복문을 벗어난다.
					
					
				}
				
			}
			
			
		}
		
	}

}
