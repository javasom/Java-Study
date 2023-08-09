package java05_exception;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
	public int data;
	public CalendarOOP() {
		do {
			start();
		}while(true);
		
	}
	//
	public void start() {
		//년월입력
		int year = inData("년도"); //2000
		int month = inData("월"); //7
		//년월1일 날짜 객체 구하기
		Calendar date = setDate(year, month);// 2000,7,1
		int week = date.get(Calendar.DAY_OF_WEEK);//요일
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);//마지막 날
		
		
		titlePrint(year, month);//제목 출력
		spacePrint(week);//공백 출력
		dayPrint(week, lastDay);//날짜 출력
	}
	//정보 입력 -- 년도와 월입력
	public int inData(String msg) {
		Scanner sc = new Scanner(System.in);
		//System.out.print(msg+"-> ");
		//return sc.nextInt(); //문자를 입력받아 숫자(int)로 변경하여 리턴
		
		//년도,월 영문,문자화 된 실수가 들어오면 예외 발생 ->InputMismatchException
		int intData = 0;
		
		do {
			try {
				System.out.println(msg+ "="); //nextInt(), next(), nextDouble()
				//intData = sc.nextInt();
				//sc.nextLine();
				intData = Integer.parseInt(sc.nextLine());
				
				//월 일때 1~12인지 확인 후 다시 입력, 먼저 처리되게 괄호해주기
				if(msg.equals("월") && (intData<1 || intData>12)) {
					System.out.println("월은 1~12사이의 값이어야 합니다.");
					continue;
				}
				
				break;
				
			}catch(NumberFormatException ime) {
				//sc.nextLine();
				System.out.println(msg+ "를(을) 잘못 입력하였습니다.");
			}
		}while(true);
		
		//결과 리턴
		return intData;
	}
	
	//날짜 객체 만들기 -- 날짜 객체-> 입력받은 년,월,일ㅇ로 변경하여 리턴 메소드
	public Calendar setDate(int y, int m) {
		Calendar now = Calendar.getInstance(); //오늘 날짜
		now.set(y, m-1, 1); //y,m,1로 변경
		return now;
	}

	//제목 출력
	public void titlePrint(int y, int m) {
		System.out.println("\t\t\t=="+y+"년 " +m+"월==");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}
	
	//공백 출력 -- 1일의 요일 입력받아 날짜 출력하기 전 공백처리하는 기능 구현
	public void spacePrint(int week) {
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
	}
	
	//날짜 출력 -- 공백수(요일), 마지막 날 정보를 이용하여 날짜 출력
	public void dayPrint(int week, int lastDay) {
		//spacePrint
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if((week-1+i)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void dayPrint2(int week, int lastDay) {
		spacePrint(week);
		dayPrint(week, lastDay);
	}
	public static void main(String args[]) {
		CalendarOOP oop = new CalendarOOP();
		//oop.start();
		//oop.dayPrint2(5, 30);
	}
}
