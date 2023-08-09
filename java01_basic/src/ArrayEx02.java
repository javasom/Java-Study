import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1~1000 사이의 난수를 200개 생성하여 배열에 저장하고
		// 난수의 총합, 평균, 최대값, 최소값을 구하여 출력하라.
	
		// 배열
		int[] num = new int[200];
		//Random rd = new Random();
		
		for(int i=0; i<num.length; i++) {
			num [i] = (int)(Math.random()*(1000))+1;
		}
		
		//총합, 최대, 최소
		int tot = 0;
		int ave = 0;
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i<num.length; i++) {
			tot += num[i];
			if(max<num[i]) max = num[i];
			if(min>num[i]) min = num[i];
		
		}
		
		//평균
		ave= tot/num.length;
		
		System.out.println("총합=" +tot);
		System.out.println("평균=" +ave);
		System.out.println("최대값=" +max);
		System.out.println("최소값=" +min);
			
			
	
	}
	
}

	

		

/* 
실행
총합=___
평균=___
최대값=___ 
최소값=___ 
*/
