import java.util.Arrays;

public class Array__basic {

	public static void main(String[] args) {
		
		//배열이란 - 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		//	int score = new int[5];
		
//			score		score[0]   1	  2		 3		4     -->참조변수 이름, 인덱스 번호
//		   [0x100]------>[  0  ][  0  ][  0  ][  0  ][  0  ]
		
		
		//배열의 선언과 생성
		//배열의 선언 - 배열을 다루기 위한 참조변수의 선언	
//			타입[]변수이름;	int[] score;
//							String[] name;
//			타입 변수이름[];
//		------------------------------------------------
//		타입[] 변수이름;			배열을 선언(배열을 다루기 위한 참조변수 score 선언
//		변수이름 = new 타입[길이];	배열을 생성(실제 저장공간을 생성)
//		int[] = score;			int타입의 배열을 다루기 위한 참조변수 score 선언
//		score = new int[]5		int타입의 값 5개를 저장할 수 있는 배열 생성
//			
//			score		score[0]   1	  2		 3		4 	 -->0~4, 5개
//		   [0x100]------>[  0  ][  0  ][  0  ][  0  ][  0  ]
//		
//
		//배열의 인덱스 - 각 요소(저장공간)에 자동으로 붙는 일련번호
		//		"인덱스(index)의 범위는 0부터 "배열길이 "-까지
//			int[] score = new int[5];	길이가 5인 int배열
//		
//		score[3] = 100;
//			score		score[0]   1	  2		 3		4     -->참조변수 이름, 인덱스 번호
//		   [0x100]------>[  0  ][  0  ][  0  ][  100  ][  0  ]  -->배열의 요소
//		int value = score[3] --> 100		
		
	
		//배열의 길이
		//배열이름.length - 배열의 길이(int형 상수)
//			int[] arr = new int[5];		//길이가 5인 int 배열
//			int tmp = arr.length;		//arr.length의 값은 5이고 tmp에 5가 저장된다.
		//		"배열을 한번 생성하면 실행하는 동안 그 길이를 바꿀 수 없다."
			
			int[] score = new int[6]; // 0~5
//				for(int i=0; i < 6; i++)
//				System.out.println(score[i]);	
//			int[] score = new int[5]; // 배열의 길이를 6에서 5로 변경
				for(int i=0; i < score.length; i++);

		//배열의 초기화
		//배열의 각 요소에 처음으로 값을 저장하는 것 0~5-1
			int[] score2 = new int[5]; //길이가 5인 int형 배열 생성
//			score[0] =50;
//			score[1] =60;
//			score[2] =70;
//			score[3] =80;
//			score[4] =90;
			
//			int[] score3 = new int[] {50,60,70,80,90}; //드문 경우
			int[] score4 = {50,60,70,80,90}; //new int[]생략 가능
											 //반드시 한 줄로 써야함
		
		//배열의 출력		   1   2  3  4  5
			int[] iArr = {100,95,80,70,60}; 
			
		//배열을 가리키는 참조변수 iArr의 값을 출력한다.
			System.out.println(iArr); // [I@14318bb와 같은 형식의 문자열이 출력된다.
			char[] chArr = {'a','b','c','d'};
			System.out.println(chArr);	// abcd가 출력된다.
			
			for(int i=0; i<iArr.length; i++) { //배열의 요소를 순서대로 하나씩 출력
			System.out.println(iArr[i]);
			}
			
		//배열 iArr의 모든 요소롤 출력한다.  [100,95,80,70,60]이 출력된다.
			System.out.println(Arrays.toString(iArr));
				
			
		
	}

}
