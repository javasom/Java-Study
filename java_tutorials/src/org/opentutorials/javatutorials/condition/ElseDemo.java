package org.opentutorials.javatutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		
		//
        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);	//true가 처음으로 등장한 구간이 실행되고 
        } else if (true) {			//if문은 종료. if문 뒤에 따라오는 다른 구간부터 시작된다.
            System.out.println(3);
        } else {
            System.out.println(4);
        }

	}

}
