package test02_basic;

public class Array2Ex2 {

	public static void main(String[] args) {
		char arr[][]= new char[10][10];
		
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) {
				
				if(r==c || r+c==arr.length-1) {//x
					arr[r][c] = 'X';
				}else {//o
					arr[r][c] = 'O';
				}
				System.out.print(arr[r][c]+ " ");
			}
			System.out.println();
		}
	}
}
	

