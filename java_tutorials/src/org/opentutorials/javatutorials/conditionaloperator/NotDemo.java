package org.opentutorials.javatutorials.conditionaloperator;

public class NotDemo {

	public static void main(String[] args) {
		// !는 부정의 의미로 not이라고 읽는다. Boolean의 값을 역전시키는 역할을 한다.
		// true에 !를 붙으면 false가 되고 false에 !을 붙이면 true가 된다.
		   if (!true) {
	            System.out.println(1);
	        }
	        if (!false) {
	            System.out.println(2);
	        }
	}

}
