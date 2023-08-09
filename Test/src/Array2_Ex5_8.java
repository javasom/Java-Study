class Array2_Ex5_8 {
	public static void main(String[] args) {
		int[][] score = {
				  { 100, 100, 100 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;
							
		for (int i = 0; i < score.length; i++) {	//new int[4][3]
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			} //2차원 배열일 경우 2중 for문을 사용
		}

		System.out.println("sum=" + sum);
	}
}

/*
  
 
 					score[0][0]score[0][1]score[0][2]
 score[0]	----->	[   100   ][   100   ][   100   ]
 					score[1][0]score[1][1]score[1][2]
 score[1]	----->	[   100   ][   100   ][   100   ]
 					score[2][0]score[2][1]score[2][2]
 score[2]	----->	[   100   ][   100   ][   100   ]
  					score[3][0]score[3][1]score[3][2]
 score[3]	----->	[   100   ][   100   ][   100   ]
  
  		score.length = 4
  		score[i].length = 3
  
 
  
*/
