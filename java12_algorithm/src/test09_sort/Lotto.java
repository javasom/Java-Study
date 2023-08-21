package test09_sort;
import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto { 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
	
		do {
			//게임수
			System.out.print("게임수=");
			int cnt = sc.nextInt();
		
			//입력받은 게임수 만큼 만들어 출력
			for(int i=1; i<=cnt; i++) {// cnt=3-> 1,2,3
				int lotto[] = new int[7];//게임을 저장할 배열
				
				//번호, 중복, 보너스까지
				for(int j=0; j<lotto.length; j++) {
					lotto[j] = random.nextInt(45)+1; //1~45 사이
					
					for(int k=0; k<j; k++) {//중복 검사
						if(lotto[k]==lotto[j]) {
							j--;
							break;
						}
					}
				}
				
				//정렬
				for(int x=1; x<lotto.length-1; x++) {//0,1,2,3,4,5
					
					int temp = lotto[x];
					int p;
					for(p=x-1; p>=0 && temp<lotto[p]; p--) {
						lotto[p+1] = lotto[p];//값 교환
					}
					
					lotto[p+1] = temp;
				}
				
				System.out.print(i+"게임= [");
				
				for(int j=0; j<lotto.length-1; j++) {
					System.out.print(lotto[j]);
					if(j==5) {
						System.out.println("], 보너스= "+ lotto[lotto.length-1]);
					}else {
						System.out.print(", ");
					}
				}
			}
	
		//계속 여부 확인
		System.out.print("계속 하시겠습니까? (1: 예, 2:아니오) -> ");
		int status = sc.nextInt();
		if(status==2) {
			break;
		}
		
		}while(true);
		
		
	} // main
	
} // class