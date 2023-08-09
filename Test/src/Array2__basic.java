import java.util.Arrays;

public class Array2__basic {

	public static void main(String[] args) {
		
		//Arrays 클래스로 배열 다루기			-Math클래스 : 수학 관련 메서드 모아놓음
		//										round() 반올림 , random() 난수
		
		// 배열의 비교와 출력 equals() , toString()
		
		int[]	arr 	= {0,1,2,3,4};			// 1차원
		int[][] arr2D	= {{11,12}, {21,22}};	// 2차원,다차원
		
		System.out.println(Arrays.toString(arr)); // [0,1,2,3,4,]
		System.out.println(Arrays.deepToString(arr2D)); // [[11,12], [21,22]]
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		//System.out.println(str2D==str2D2); --> 참조변수 값 비교시 == 항상 false
		System.out.println(Arrays.equals(str2D, str2D2));		//false
		System.out.println(Arrays.deepEquals(str2D, str2D2));	//true
		
		
		// Arrays로 배열 다루기
		// 배열의 복사 - copyOf(), copyOfRange()
		
		int[] arr1 = {0,1,2,3,4};		//복사할 요소의 갯수, 5
		int[] arr2 = Arrays.copyOf(arr, arr.length);	// arr2=[0,1,2,3,4]
		int[] arr3 = Arrays.copyOf(arr, 3);				// arr2=[0,1,2]					
		int[] arr4 = Arrays.copyOf(arr, 7);				// arr2=[0,1,2,3,4,0,0]			
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);		// arr2=[2,3]	<-4X	//~from 'to'생략
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);		// arr2=[0,1,2,3,4,0,0]	
		
		// 배열의 정렬 - sort()
		
		int[] arr7 = {3,2,0,1,4};
		Arrays.sort(arr7); // 배열 arr을 정리한다. 오름차순
		System.out.println(Arrays.toString(arr7)); // [0,1,2,3,4]
		
		
	}
}
