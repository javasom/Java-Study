
public class ArrayEx5_2 {

	public static void main(String[] args) {
		//배열의 활용(1)
		
		//배열의 모든 요소를 더해서 총합과 평균을 구한다.
		
		int	  sum = 0; 		// 총합을 저장하기 위한 변수
		float average = 0f; // 평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]; //반복문을 이용해서 배열에 저장되어 있는 값을을 모두 더한다.
			
		}
		
		average = sum / (float)score.length; // 계산결과를 float타입으로 얻으려 형변환
		//	478 / 5 = 95 -> int
		//  478 / (float)5 -> 478 / 5.0f -> 478.0f / 5.0f -> 95.6f 

		System.out.println("총합 : " +sum);
		System.out.println("평균 : " +average);
		
	}

}
