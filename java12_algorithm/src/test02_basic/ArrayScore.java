package test02_basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayScore {
	static int stuCount;//학생 수
	static int subjectCount;//과목 수
	static String names[];//학생 이름
	static int stuScore[][];//학생 점수, 총점, 평균, 석차, 과목별 총점, 과목별 평균
	//정보 얻어 오기 - 파일의 정보를 가져와 배열에 대입
	static void setData() throws FileNotFoundException, IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File("src/test02_basic/sungjuk.txt")));
		
		stuCount = Integer.parseInt(br.readLine());
		subjectCount = Integer.parseInt(br.readLine());
		names = new String[10];
		stuScore = new int[stuCount+2][subjectCount+3];
		
		for(int i=0; i<stuCount; i++) {//0,1,2,3,4...9
			String data[] = br.readLine().split(",");	//1줄 읽기
			names[i] = data[0];
			
			for(int j=0; j<subjectCount; j++) {//0,1,2
				stuScore[i][j] = Integer.parseInt(data[j+1]);
			}
		}		
	}
	static void process() {
		for(int r=0; r<stuCount; r++) {//행
			for(int c=0; c<subjectCount; c++) {//열
				stuScore[r][subjectCount] += stuScore[r][c];//개인별 총점
				stuScore[stuCount][c] += stuScore[r][c];//과목별 총점
			}
			stuScore[r][subjectCount+1] = stuScore[r][subjectCount]/subjectCount;//개인별 평균
		}
		//과목별 평균
		for(int c=0; c<subjectCount; c++) {
			stuScore[stuCount+1][c] = stuScore[stuCount][c]/stuCount;
		}
		scoreRank();		
	}
	static void scoreRank() {
		for(int i=0; i<stuCount; i++) {// 0,1,...9
			
			for(int j=0; j<stuCount; j++) {// 0,1,...9
				if(stuScore[i][subjectCount] < stuScore[j][subjectCount] ) {
					stuScore[i][subjectCount+2]++;
				}
			}
			stuScore[i][subjectCount+2]++;
		}
	}
	static void print() {
		for(int i=0; i<stuCount; i++) {
			System.out.print(names[i]+" ");//이름
			for(int j=0; j<stuScore[i].length; j++) {
				System.out.printf("%d ", stuScore[i][j]);
			}
			System.out.println();
		}
		//과목별 총점
		System.out.printf("\n과목별 총점 ");
		for(int j=0; j<stuScore[0].length; j++) {
			System.out.print(stuScore[stuCount+1][j]+ " ");
		}
		//과목별 평균
	}
	public static void main(String[] args) {
		try {
		//파일의 정보를 가져와서 배열에 대입
		setData();
		//성적 처리
		process();
		//출력
		print();
		}catch(Exception e) {e.printStackTrace();}
	}

}
