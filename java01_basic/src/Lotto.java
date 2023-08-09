import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto { 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] lotto = new int[7]; // 배열크기
	
		
	//배열에 중복값없이 1~45 난수 초기화	
		System.out.println("게임 수 = ");
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) ( Math.random() *45) + 1;
			for (int j = 0; j < i; j++ ) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		} 
		
	//오름차순 정렬	
			
	
		
	// 보너스 번호
		for (int i = 0; i < lotto.length-1; i++){
			System.out.print(lotto[i]+" ");
		}
		System.out.println("Bouns = "+lotto[6]);
		

	
	} // main
	
} // class