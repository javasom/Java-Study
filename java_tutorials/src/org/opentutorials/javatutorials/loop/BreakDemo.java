package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		//반복작업을 중간에 중단시키고 싶다면 어떻게 해야 할까?
		//break를 사용하면 된다. 
        for (int i = 0; i < 10; i++) {
            if (i == 5) //한 줄이면 중괄호 생략 
                break; //종료되고 for문을 벗어남
            System.out.println("Coding Everybody " + i);
        }
 

	}

}
