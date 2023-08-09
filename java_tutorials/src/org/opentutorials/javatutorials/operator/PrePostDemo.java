package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
        int i = 3;
        i++; //i=i+1
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력	i라는 변수에 1이라는 값을 더한 결과를 괄호 안에 치환하여 프린트ln하는 역할
        System.out.println(i++); // 6 출력	1이 더해지긴 하지만, 괄호 안에서 더해지지는 않는다. 맥락이 끝난 뒤 증가하기 때문에 
        System.out.println(i); // 7 출력     이 다음에서 7이다.

	}

}
