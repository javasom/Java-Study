package test07_search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(int arr[], int n, int key) {
		int pl = 0; //검색 범위의 시작 index = 0
		int pr = n-1; // 검색 범위의 끝 index = 데이터수 -1	arr.length-1
		
		do {
			int pc = (pl+pr)/2;		//중간 index
			if(arr[pc]==key) {
				return pc;
			}else if(arr[pc] > key) {
				pr = pc -1;
			}else if(arr[pc] < key) {
				pl = pc +1;
			}
			
			
		}while(pr>=pl); // 더 이상 값이 없다.
		return -1;//찾을 값이 존재하지 않는다.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();

		System.out.print("요소수 : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		//값 생성
		for(int i=0; i<n; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		//정렬
		Arrays.sort(arr); //배열을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		System.out.print("찾을 값 : ");
		int key = sc.nextInt();
		
		int searchIndex = binarySearch(arr, n, key);
		if(searchIndex==-1) {
			System.out.println("배열에 "+key+"은 없습니다.");
		}else {
			System.out.println(key+"는 arr["+searchIndex+"] 위치에 값이 존재합니다.");
		}
	}
}
