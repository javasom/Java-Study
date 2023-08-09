package org.opentutorials.javatutorials.loop;

public class ForDemo {

	public static void main(String[] args) {
//  	for문은 특정한 횟수만큼 반복 실행을 하는 경우에 자주 사용된다.
//		for(초기화; 종료조건; 반복실행){
//		    반복적으로 실행될 구문}
		
//		초기화 : 반복문이 실행될 때 1회 실행된다.
//		종료조건 : 초기화가 실행된 후에 종료조건이 실행된다.
//				종료조건의 값이 false일 때까지 반복문의 중괄호 구간의 코드가 반복 실행된다.
//		중괄호 구간의 실행이 끝나면 반복 실행이 실행된다. 일반적으로 이 곳에 i++와 같이
//		변수를 증가시키는 로직이 위치하고, 이것이 실행된 후에 종료조건이 실행된다.
//		종료조건이 false가 될 때까지 이 과정이 반복된다.
		
        for (int i = 5; i < 20; i=i+2) {
            System.out.println("Coding Everybody " + i);
        }
			
	}
}


