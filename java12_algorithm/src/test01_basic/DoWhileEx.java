package test01_basic;

import java.util.Random;

public class DoWhileEx {

	public static void main(String[] args) {
        
        int count = 0;
        int max= 64;  // 최고값을 저장할 변수 초기화
        do {
        	count++;
        	int r = (int)(Math.random()*(90-65+1))+65;
            //int rnum = r.nextInt(26)+65; // 65부터 90까지 난수 생성
            System.out.print(r+" ");
            if (max<r)max = r; 
        } while (count<10);

        System.out.println("\n"+ max); // 최대값 출력

	}

}

/*
 65~90 사이의 임의의 난수를 10개 만들어 최고값을 출력하라.
 
 [출력]
 65 73 77 74 86 81 90 75 88 67
 90
 */

