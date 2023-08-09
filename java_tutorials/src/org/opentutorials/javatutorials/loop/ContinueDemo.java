package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue; 
            //실행중인 반복문이 일단 종료 되고 실행X , 그 다음 반복이 다시 실행
            System.out.println("Coding Everybody " + i);
        }
	}

}
