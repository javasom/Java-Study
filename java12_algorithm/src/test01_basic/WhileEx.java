package test01_basic;

import java.util.Scanner;

public class WhileEx {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

        System.out.print("단을 입력하시오 : ");
        int dan = sc.nextInt();
        
        int i = 1;
        while (i <= 9) { 
        	int r = dan * i;
            System.out.println(dan + " * " + i + " = " + r);
            i++;
        }
        
        
        
        
//        if(dan>=2 && dan <=9) {
//        	for(int i=1; i<=9; i++) {
//        		int result = dan * i;
//        		System.out.println(dan + " * " + i + " = " + result);
//        	}
        }  
	}



/*
 단을 입력받아 구구단을 출력하시오
 
 [입력]
 단을 입력하시오 : 7
 
 [출력]
 7 * 1 = 7
 7 * 2 = 14
 7 * 3 = 21
 :
 
 7 * 9 = 63
 */


