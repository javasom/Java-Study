
public class Array05 {

	public static void main(String[] args) {
		// 2차원 배열
		//배열을 선언하기
		int num[][] = new int[5][5];
		// 행  열
		num[2][1] = 90;
		num[0][2] = 85;
		num[4][3] = 75;
		
		//2차원배열명.length => 행의 수
		for(int r=0; r<num.length; r++) {//행의 인덱스
			
			//2차원배열멸[index].length => 열의 수	num[1].length
			for(int c=0; c< num[r].length ; c++) {
				System.out.print(num[r][c]+"\t");
			}
			System.out.println();
		}
		
		//2차원 배열셍성시 초기값 설정하기
		String[][] jusorok = {
				{"홍길동","1234","aaa@neta.com"},
				{"이순신","5678","bbb@daum.com"},
				{"안중근","7777","ccc@naver.com"}
		};
		
		for(int i=0; i<jusorok.length; i++) {
			for(int j=0; j<jusorok[i].length; j++) {
				System.out.print(jusorok[i][j]+"\t");
			}
			System.out.println();
		}
		
		//2차원의 행마다 열의 수를 다르게 설정하기
		int data[][] = new int[3][];
		data[0] = new int[3];
		data[1] = new int[4];
		data[2] = new int[2];
		
		data[2][1] = 100;
		data[1][2] = 90;
		data[0][0] = 80;
		
		for(int a[] : data) {
			for(int b: a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
		
	}

}
