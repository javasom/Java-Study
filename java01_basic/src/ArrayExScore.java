import java.util.Scanner;

public class ArrayExScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 학생수를 입력받아 개인별 총점, 평균, 석차, 과목별 총점, 평균
		String title[] = {"국어","영어","수학"}; //과목명 배열
		
		// 학생수 입력받아 데이터를 저장할 공간 확보
		System.out.print("학생 수= ");
		int cnt = Integer.parseInt(sc.nextLine()); // "5" -> 5 int로 변환
			
		// 학생명을 저장할 배열
		String names[] = new String[cnt]; // 5-> 0,1,2,3,4
		
		//점수,총점,평균,석차 등을 저장할 배열
		double score[][] = new double[cnt+2][6];
		
		//기본데이터 입력받기
		for(int i=0; i<cnt; i++) {//학생수만큼 i=0,1,2,3,4
			//이름
			System.out.print("학생 이름= ");
			names[i] = sc.nextLine();
			//세과목의 점수
			for(int j=0; j<title.length; j++) {//0,1,2
				System.out.print(title[j]+"= ");
				score[i][j] = Double.parseDouble(sc.nextLine());
			}	
		}
		//성적처리
		for(int i=0; i<cnt; i++) {// 0,1,2,3,4
			for(int j=0; j<title.length; j++){// {0,1,2
			score[i][3] += score[i][j]; //개인별 총점
			score[cnt][j] += score[i][j]; //과목별 총점
			}
			score[i][4] = score[i][3] / title.length;//개인별 평균
		}
		//과목별 평균
		for(int i=0; i<title.length; i++) {// 0,1,2
			score[cnt+1][i]= score[cnt][i] / cnt;
		}
		//석차 구하기
		for(int i=0; i<cnt; i++) {// 0,1,2,3,4
			
			for(int j=0; j<cnt; j++) {// 0,1,2,3,4
				//내 점수			상대방 점수
				if(score[i][4] < score[j][4]) {
					score[i][5]++;// 석차변수의 값을 1증가
				}	
			}
			//본인석차 1증가
			score[i][5]++;
		}
		
			
		//출력하기
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
	
		for(int i=0; i<names.length+2; i++) { //0,1,2,3,4,5,6
			if(i==cnt) System.out.print("총점\t");
				else if(i==cnt+1) System.out.print("평균\t");
					else System.out.print(names[i]+"\t");
			
			
		//각과목,총점,평균,석차
		for(int j=0; j<score[i].length; j++) { //0,1,2,3,4,5
			if(j==5) {
				System.out.printf("%8d", (int)score[i][j]);
			}else {
				System.out.printf("%8.1f", score[i][j]);
			}
			
			}
			System.out.println();//줄바꿈
		}	
	}
}
