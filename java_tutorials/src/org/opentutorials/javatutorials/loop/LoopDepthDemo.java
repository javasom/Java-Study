package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// 반복문 안에는 다시 반복문이 나타날 수 있다. 
        for (int i = 0; i < 10; i++) {
        	//먼저 실행
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
//               					0		0
//       							0		1
//                					0		2
//                					0		3             					
            }
            
        }
	}
}
