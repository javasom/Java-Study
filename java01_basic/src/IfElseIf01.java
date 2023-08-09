
public class IfElseIf01 {

	public static void main(String[] args) {
		// if else if문
		// 국어, 영어, 수학, 총점, 평균
		int kor = 95;
		int eng = 80;
		int mat = 70;
		
		// 총점
		int tot = kor + eng + mat;
		
		// 평균
		double ave = tot / 3. ;
		
		// if else if문을 이용하여 학점 구하기
		char grade;
		if(ave>=90) {//A`학점
			grade = 'A';
		}else if(ave>=80) {//B학점 
			grade = 'B';
		}else if(ave>=70) {//C학점
			grade = 'C';
		}else if(ave>=60) {//D학점
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		//if문
		String grade2 = "";
		if(ave>=90) {
			grade2 = "A";
		}
		if(ave>=80 && ave<90) {
			grade2 = "B";
		}
		if(ave>=70 && ave<80) {
			grade2 = "C";
		}
		if(ave>=60 && ave<70) {
			grade2 = "D";
		}
		if(ave>=0 && ave<60) {
			grade2 = "F";	
			
		}
		
		System.out.println("총점="+tot);
		System.out.println("평균="+ave);
		System.out.println("학점="+grade);
		System.out.println("학점2="+grade2);
	}
	
}

/*
 	90~100 : A학점
 	80~89.9999 : B학점
 	70~79.9999 : C학점
 	60~69.9999 : D학점
 	0~59.9999  : F학점
 
 */

/*
	if(조건식1){
		조건식1이 참일 때 실행문;
	}else if(조건식2){
		조건식2가 참일 때 실행문;
	}else if(조건식3){
		조건식3이 참일 때 실행문;
	}else{
		조건식1, 조건식2, 조건식3 모두 만족하지 않을 때
	}
*/