package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		//String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
        String[] classGroup = new String[4];
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length); //몇 개의 값이 담겨질 수 있느냐
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);

	}

}
