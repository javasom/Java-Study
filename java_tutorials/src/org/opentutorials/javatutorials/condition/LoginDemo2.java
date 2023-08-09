package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		
		//if문 안에 다시 if문이 등장했다. 
		//즉 사용자가 입력한 값과 아이디의 값이 일치하는지를 확인한 후에 일치한다면 비밀번호가 일치하는지 확인한 것이다.
		//이렇게 조건문은 조건문 안에 중첩적으로 사용될 수 있다.
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing")) {				
            if (password.equals("111111")) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
 
        } else {
            System.out.println("wrong");
        }

	}

}
