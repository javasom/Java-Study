package java02_basic_api;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// Random : 난수를 생성하는 클래스
		
		Random random = new Random();
		
		
		for(int i=0; i<100; i++) {
			//boolean boo=random.nextBoolean();
			//System.out.print(boo+"\t");
	
			//double abl = random.nextDouble();
			//System.out.print(abl+"\t");
			
			
			//int ranInt = random.nextInt();
			//12~42사이의 값을 난수로 구하기
			//1~6
			//					큰수-작은수+1
			int ranInt = random.nextInt(6)+1;	// 100-> 0~99, 25->0~24
			System.out.print(ranInt+"\t");
			
			if(i%10==0) System.out.println();{ 
				
				
			}
		}
	}
}
