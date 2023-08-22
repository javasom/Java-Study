package test09_sort;

import java.util.Random;

public class ArrayQuickSort {
		//Quick Sort
		//	리스트의 가운데 값을 선택하여 (pivot)하고
		//	피벗 위치의 값보다 작은 것은 왼쪽에, 큰 것은 오른쪽에 배치하어 정렬한다.
		//				  0	  1	  2   3   4   5   6   7   8   9
	static int data[]; // 52, 48, 48, 12, 56, 35, 45, 60, 68, 67
	
	static void arrayPrint() {
		for(int d:data) {
			System.out.print(d+ " ");
		}
		System.out.println();
	}
	static void swap(int idx1, int idx2) { //교환
		int temp = data[idx1];
		data[idx1] = data[idx2];
		data[idx2] = temp;
	}
	//						  0		 	9
	static void quickSort(int left, int right) {
		int pLeft = left;	//0
		int pRight = right; //9
		
		int pivot = (left+right)/2; //피벗	4
		
		int x = data[pivot]; // 피벗의 위치의 값을 변수에 대입	60
		
		do {// 교환할 데이터를 pLeft, pRight위치를 기준으로 찾기
			
			// pivot보다 큰 값을 왼쪽에서 찾기
			while(data[pLeft] < x) {
				pLeft++;//1
			}
			// pLeft -> 7 : 피벗보다 큰 값의 index
			
			// pivot보다 작은 값을 오른쪽에서 부터 찾기
			//			67->48	60
			while(data[pRight] > x) {
				pRight--;//9->8
			}
			// pRight -> 8 -> 7 -> 6
			if(pLeft <= pRight) //교환
				swap(pLeft++, pRight--); // 5, 6
			
		}while(pLeft <= pRight);
		
		//재귀 호출
		if(left<pRight) quickSort(left, pRight);//왼쪽 재귀 호출
		if(pLeft<right) quickSort(pLeft, right);//오른쪽 재귀 호출
	}
	public static void main(String[] args) {
		// 데이터 준비
		data = new int[10];
		
		Random ran = new Random();
		
		for(int i=0; i<data.length; i++) {
			data[i] = ran.nextInt(100)+1; // 1~100까지
		}
		
		System.out.println("~~~~~~~~~~~~정렬 전~~~~~~~~~~~~");
		arrayPrint();
		
		//		 시작 인덱스, 끝 인덱스
		quickSort(0, data.length-1);
		
		System.out.println("~~~~~~~~~~~~정렬 후~~~~~~~~~~~~");
		arrayPrint();
	}
}
