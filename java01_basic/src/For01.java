
public class For01 {

	public static void main(String[] args) {
		// 반복문 : for문
		
	/*
	1
	2
	3
	4
	5		
	*/
	int sum = 0; //누적시킬 변수
	int i = 0;
	for( i=1; i<=100 ; i++ ) {//	i++, ++i, i=i+1, i+=1
		sum = sum + i; // sum +=i;
		//System.out.println(i+", "+sum);
		
	}
	System.out.println("1~"+(i-1)+"까지의 합은="+ sum);
	
	




	/*
	 5 
	 4 
	 3 
	 2
	 1 
	 */
	for(int j=5;j>=1; j--) {// --j, j--, j-=1, j=j-1	5,4,3,2,1,0,-1,-2
		System.out.println(j);
		
	}
	
	// 1~10까지 짝수만 출력하라.
	for(int x=2; x<=10; x +=2) {// x = x + 2
		System.out.println("x="+ x);
	}
	
	
	
}
}




/*

	for(초기값; 최종값; 증감값;){
		실행문;
		실행문
	}


*/