package test05.ex.backjun;

import java.util.Scanner;

public class Main1244 {
	static Scanner sc = new Scanner(System.in);
	//스위치의 상태를 보관할 배열
					  // 1 2 3 4 5 6 7 8
	static int arr[]; // 0 1 0 1 0 0 0 1
	
	//남학생일 때
	static void man(int swNum) {
		// swNum의 배수 위치의 스위치 상태를 바꾼다. 2-> 2, 4, 6, 8		3-> 3, 6
		for(int i=swNum; i<arr.length; i+=swNum) {//i는 한 번 증가할 때 swNum만큼 증가
			//i번째의 스위치 상태 변경
			arr[i] ^= 1; // 0->1, 1->0 바뀌므로 스위치 상태가 바뀐다.
		}
	}
	//여학생일 때
	static void woman(int swNum) {
		int left = swNum -1; //왼쪽 index를 만들 변수	3->2	5->4
		int right = swNum +1;//오른쪽 index를 만들 변수 3->4	5->6
		
		while(true) {
			//break가 발생하는 상황
			//left가 0보다 작거나 같으면	 9
			//left, right위치의 값이 다르면
			if(left<=0 || right>=arr.length){
			break;
			}
			//left, right위치의 값이 다르면 반복문 중지
			if(arr[left] != arr[right]) {
				break;
			}
			
			left--;
			right++;
			
		}	
		// left+1부터 right-1까지 스위치 상태 변경하기
		for(int i=left+1; i<=right-1; i++) {
			arr[i] = arr[i] ^1;
		}
	}
	//출력하기
	static void switchPrint() {
		for(int i=1; i<arr.length; i++) {//1,2,3,4,5,6,7,8
			System.out.print(arr[i]+" ");
			if(i%20==0) System.out.println();
		}
	}
	public static void main(String[] args) {
		
		//스위치 수
		int num = sc.nextInt();
		
		//배열의 생성
		arr = new int[num+1];
		
		//스위치 상태를 입력받아 배열에 저장
		//			 8 <	9
		
		for(int i=1; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//학생 수
		int student = sc.nextInt();
		
		// 1 3
		// 2 3
		for(int s=1; s<=student; s++) {
			int gender = sc.nextInt();//성별
			int swNum = sc.nextInt();//스위치 번호
			
			if(gender==1) man(swNum);//남학생일 때 
			else if(gender==2) woman(swNum);//여학생일 때
		}
		
		switchPrint();
	}

}
