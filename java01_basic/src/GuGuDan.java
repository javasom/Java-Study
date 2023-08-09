
public class GuGuDan {

	public static void main(String[] args) {
		
		for(int startDan=1; startDan<=9; startDan +=3) { //startDan = startDan +3; 1, 4, 7
			//단제목			1				4
				for(int dan=startDan;dan<startDan+3 ;dan++) { // 1 -> dan 1,2,3   4->dan 4,5,6   7-> 7,8,9
					System.out.print("="+dan+"단=\t");
				}
			
				System.out.println(); //줄바꿈
			
			
			//구구단 출력
				for(int i=2; i<=9; i++) { // 2,3,4,5,6,7,8,9
					
					for(int dan=startDan; dan<startDan+3; dan++) {
						int r = dan*i;
						System.out.print(dan+"*"+i+"="+r+"\t");
					}
				System.out.println(); //줄바꿈
			}
		}
	}		
}
