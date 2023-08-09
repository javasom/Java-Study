
public class ArrayEx03 {

	public static void main(String[] args) {
		
		int numData[][] = new int[11][11];
		// 1. 값을 2차원 배열에 저장하기	11-1
		for(int row=0; row<numData.length-1; row++) {//행의 index 0,1,2,3,4....9
			
			for(int col=0; col<numData[row].length-1; col++) {//열의 index 0,1,2,3,4....9
				int data = (row+1) * (col+1);
				numData[row][col] = data;
				//		[0]		[11-1]
				numData[row][numData[row].length-1] += data;//열의 합
				//		[10]			  [0]
				numData[numData.length-1][col] += data;//행의 합
			}	
		}
		// 2.
		for(int i=0; i<numData.length; i++) {// i=0,1.....10
			
			for(int j=0; j<numData[i].length; j++) {// j=0,1,2......10
				System.out.printf("%5d" , numData[i][j]);
				}
			System.out.println();
		}
		
		
	}
	
}
