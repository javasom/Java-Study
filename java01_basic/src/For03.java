
public class For03 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {			//행처리
			
			for(int j=1; j<=5; j++) {		//열처리
				
				//System.out.printf("%3d", j);
				System.out.printf("%2s", "*");
			}
			//줄바꿈
			System.out.println();
		}
/*
 
 
*
* *
* * * 
* * * *
* * * * *


 */
		for(int row=1; row<=5; row++) {//1,2,3,4,5
						//col <=1	col<=2	col<=3
			for(int col=1; col<=row	; col++) {
				System.out.print("* ");
				
			}
			System.out.println();
	
	}
		
/*
 
 
 * * * * *
 * * * *
 * * *
 * *
 * 
 
  
 */
		
		for(int row=5; row>=1; row--) {//1, 2, 3, 4, 5		5, 4, 3, 2, 1
			
			// 5, 4, 3, 2, 1
for(int col=1; col<=row	; col++) {
	System.out.print("* ");
	
	}
System.out.println();
	}
		
		
		
/*


 		*
 	  * *
 	* * *
  * * * *
* * * * *


 */		
	
		
for(int i=1; i<=5; i++) {//1,2,3,4,5
	//여백				5-1, 5-2, 5-3, 5-4, 5-5
	for(int space=1; space<=5-i; space++) {
	System.out.print("  ");
	}
			
	for(int j=1; j<=i; j++) {
	System.out.print("* ");
	
	}
	System.out.println();
	}		
	


/*
 

 * * * * *
   * * * * 
   	 * * * 
   	   * *
   	   	 * 
 
 
 */


for(int i=5; i>=1; i--) {// 5,4,3,2,1	
		//공백		0
	for(int s=1; s<=5-i; s++) {
		System.out.print("  ");
		
	}
		//문자
	for(int j=1; j<=i; j++ ) {
		System.out.printf("* ");
	}
	
	System.out.println();
}


		

	}//main

}//class

