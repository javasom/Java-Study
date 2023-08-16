package test04.ex.sw;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		try {
			// 데이터 가져오기
			System.setIn(new FileInputStream("src/test03/ex/sw/input.txt"));
			
			Scanner sc = new Scanner(System.in);
			int cnt = sc.nextInt();//문제수
			
			for(int i=1; i<=cnt; i++) {//문제수 만큼 반복
				int num = sc.nextInt();//문제 번호
				int numCnt[] = new int[101];//값의 수를 구할 배열
				for(int j=1; j<=1000; j++) {//천 번 반복
					numCnt[sc.nextInt()]++;
				}
				//System.out.println(Arrays.toString(numCnt));
				
				//최빈수
				int maxIdx = 0;	//제일 큰 값이 있는 index
				for(int c=1; c<numCnt.length; c++) { // c=index
					if(numCnt[maxIdx] <= numCnt[c]) {
						maxIdx = c;
					}
				}
				System.out.printf("#%d %d\n", num, maxIdx);
			}

		}catch(Exception e) {}
	}
}
