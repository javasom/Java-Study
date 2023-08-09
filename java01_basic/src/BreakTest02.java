
public class BreakTest02 {

	public static void main(String[] args) {
		
		point: //라벨표시
		for(int i=1; i<=10; i+=1) {
			
			for(int j=1; j<=10; j+=1) {
				System.out.println("i="+i+", j="+j);
				
				if(j==5) {
					break point;
					
					
				}
				
			}
			//
		}
	
		// while문에 break 사용하기
		int n = 1;
		int sum = 0; //n을 누적시킬 변수
		while(true) {
			sum += n;
			System.out.println("1~"+ n+"까지의 합은 "+ sum);
			if(n>10)
				break;
			n++;
			
		}
	}
}
