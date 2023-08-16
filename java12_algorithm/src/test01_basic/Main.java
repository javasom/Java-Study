package test01_basic;

import java.util.Scanner;

public class Main {
	 static Scanner sc = new Scanner(System.in);
	 static int middleNumber(int a, int b, int c) {
		 if(a<b && b<c || a>b && b>c) {
//			 a < b < c
//			 a > b > c
			 return b;
		 }else if(b<c && c<a || b>c && c>a) {
//			 b < c < a
//			 b > c > a
			 return c;
		 }else if(c<a && a<b || c>a && a>b) {
//			 c < a < b
//			 c > a > b
			 return a;
		 }else {
		 }
		 	return -1;//중간값이 없을 때
	 	 }
	 
	 public static void main(String[] args) {
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 sc.nextLine(); // 엔터 버리기
		 System.out.println(middleNumber(a, b, c));

    }
}
/*
a < b < c
a > b > c

b < c < a
b > c > a

c < a < b
c > a > b
 
 중위수 출력
 [입력]
 56 15 84
 [출력]
 56


 [입력]
 89 15 84
 [출력]
 84
*/