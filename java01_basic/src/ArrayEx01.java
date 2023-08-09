import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 국어, 영어, 수학, 과학, 물리 시험에 대한 점수를 처리하라.
		// 총점, 평균 구하기

		String lbl[] = {"국어","영어","수학","과학","물리"};// 라벨을 보관할 배열
		int jumsu[] = new int[lbl.length];			 // 각 과목의 점수를 보관할 배열
	
		//데이터 입력
		for(int i=0; i<lbl.length; i++) { // 0,1,2,3,4
			System.out.print(lbl[i]+"=");
			jumsu[i] = sc.nextInt();
			
		}
		
		//총점
		int sum=0;
		for(int i=0; i<jumsu.length; i++) { // 0,1,2,3,4
			sum += jumsu[i];
			
		}
		
		//평균			과목수, 배열의 크기
		int ave = sum / jumsu.length;
		
		System.out.println("총점=" +sum);
		System.out.println("평균=" +ave);
	}

}


/*
실행
국어=90
영어=80
수학=99
과학=88
물리=87

총점=?
평균=?
*/
