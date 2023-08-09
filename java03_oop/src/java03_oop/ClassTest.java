//팩키지명
package java03_oop;

//사용할 클래스가 있는 위치
import java.lang.*;
import java.util.Random;
import java.util.Scanner;
//접근제한자:public, protected,default,private
public class ClassTest {
	//필드, 멤버변수 = 전역변수, 실행문은 표기할 수 없다.
	int num = 1234; //6234 ->11234
	String name = "홍길동";
	
	int data; //초기값이 0
	Scanner scan = new Scanner(System.in); //객체만들어 초기값
	Scanner scan2; // null
	
	int a[]; // null
	int b[] = new int[5]; // 0 0 0 0 0
	
	Random ran = new Random();
	
	final int BAN = 3;		
	final int BUN = 25;

	//생성자메소드 : new키워드로 클래스를 객체로 만들 때 필요하다.
	//			 생성자메소드명은 클래스명과 같아야 한다.
	//			 객체생성시 1번 실행 됨
	//			 매개변수 없는 생성자 메소드는 없으면 컴파일시 컴파일러 생성자를 만들어 준다.
	//			  --- 단, 상속이 아닐 때
	
	//생성자메소드 오버로딩 : 생성자메소드가 여러 개일 때
	//					매개변수(arguments) 갯수가 다르거나, 데이터형이 달라야 한다.
	public ClassTest() {
		//생성자메소드 영역 : if,for,변수선언,배열생성,객체생성
		System.out.println("CalssTest()생성자 메소드 실행...");
		int kor = 60;	
		System.out.println(name+"="+ kor);
	}
	public ClassTest(int num) {
		System.out.println("num=" +num);
		
	}
	public ClassTest(String colorName) {
		System.out.println("colorName="+ colorName);
	}
	public ClassTest(int num, String colorName) {
		System.out.println(num+"->" +colorName);
	}
	//메소드 : 메소드 단위로 기능을 구현한다.
	//반환형이 있다. 반환형이 없을 때 void, 반환형이 있을 때는 반환하는 데이터형을 기술한다.
	//오버로딩 : 같은 메소드명이 여러개 존재할 수 있다.
	//			매개변수의 갯수나 데이터형이 달라야한다.
	public int getNum() {
		num = num + 5000;
		return num; //반환형이 있을 때는 return을 하여 외부로 데이터를 내보낸다.
	}
	public int getNum(int value) {
		num = num + value;
		return num;
	}
	public void setName() {
		name = "이순신";
		System.out.println("name="+ name);
	}
	
	//내부클래스
	//static영역
	
	}


