import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		
	//데이터	
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
	//계산
		int tot = kor + eng + math;
		double avg = (double)tot / 3;
	//학점 -> avg를 이용
	// (int)(avg/10)
	// (int)avg/10
		String grade = "";
		switch( (int) (avg/10) ) { // 95.6 -> 9.56 -> 9
		case 10:
		case 9: grade = "A";
				break;
		case 8: grade = "B";
			break;
		case 7: grade = "C";
			break;
		case 6: grade = "D";
			break;
		default:
				grade = "F";

		}

		System.out.printf("총점->%d\n", tot);
		System.out.printf("평균->%.2f\n", avg);
		System.out.printf("학점->%s\n", grade);
		
	}
}

/*
 
  콘솔에서 국어, 영어, 수학 점수를 입력받아  
  총점, 평균, 학점을 구하라.
  
  if문을 사용하지 않아야 한다. switch문 사용.
 
  점수 범위 : 각 과목은 0~100점 사이의 값이다.
  
  	90~100 : A학점
 	80~89.9999 : B학점
 	70~79.9999 : C학점
 	60~69.9999 : D학점
 	0~59.9999  : F학점
  
 실행
 국어점수=80
 영어점수=80
 수학점수=80
 
 총점=240
 평균=80
 학점=B
  
 */