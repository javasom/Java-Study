
public class Operator3 {

	public static void main(String[] args) {
		// 논리연산자 &&->and		||->or
		
		// 어떤 수가 100크면 100보다, 100보다 작으면 100보다 작다.
		// 1~100 사이의 값이면 출력하고 아니면 잘못된 값이다.
		//	  1<= data<=100

		int data = 52;
		//boolean result = 1 <= data <= 100;
		
		//52				true		true
		//152				true		false
		boolean result = data>=1  &&  data<=100;
		
		String msg = (result)? "1~100사이의 값입니다." : "1~100사이의 값이 아닙니다." ;
		System.out.println(msg);
	}

}
