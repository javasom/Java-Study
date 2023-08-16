package test01_basic;

import java.util.Scanner;

public class IfEx {

	public IfEx() {
	}
	
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("국어점수입력 : ");
        int kor = scanner.nextInt();
        
        System.out.print("영어점수입력 : ");
        int eng = scanner.nextInt();
        
        System.out.print("수학점수입력 : ");
        int mat = scanner.nextInt();
        
        int totalScore = kor + eng + mat;
        double ave = totalScore / 3.0;
        
        String result;
        
        if (ave>=60) {
            if(kor<40 || eng<40 || mat<40) {
            result = "과락으로 불합격";
        } else {
            result = "합격";
        }
        }else {
            result = "불합격";
            }
        
        System.out.println("결과: " + result);
        
  
    }
}
/*
java로 중첩if를 이용하여 프로그램을 작성하시오.

3과목의 점수를 입력받아서 합격인지 불합격인지 출력하시오.
3개의 과목이 전부 40이상이어야 하고 평균이 60이어야 "합격" 출력
평균이 60이 넘지만 1개의 과목이라도 40 미만이면 "과락으로 불합격 출력
평균이 60미만이면 "불합격" 출력

[실행결과]
국어점수입력 : 
영어점수입력 : 
수학점수입력 : 
결과 = 합격

국어점수입력 : 
영어점수입력 : 
수학점수입력 : 
결과 = 과락으로 불합격

국어점수입력 : 
영어점수입력 : 
수학점수입력 : 
결과 = 불합격

 */

