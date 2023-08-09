package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111111")) {
        	//입력한 id와 egoing를 비교, 입력한 password와 111111를 비교
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

	}

}
