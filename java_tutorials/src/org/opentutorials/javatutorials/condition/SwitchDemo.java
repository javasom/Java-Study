package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		switch(4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default: //switch문을 사용할 때 조건에 들어온 값이 
				 //case문 어디에도 속하지 않는다면 default로 정의된 부분이 실행
			System.out.println("default");
		}
		
		System.out.println("switch(2)");
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		int val = 1;
		if(val == 1) {
			System.out.println("one");
		}
		else if(val == 2) {
			System.out.println("two");
		}
		else if(val == 3) {
			System.out.println("three");
		}
		

	}

}
