import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

	public static void main(String[] args) {
		// 년, 월을 입력받아 아래와 같이 달력을 출력하라.
		// 년도=2020, 월=12 
		Scanner sc = new Scanner(System.in);
		String[] title= {"일","월","화","수","목","금","토"};
		
		// 1.데이터 준비
		System.out.println("년도= ");
		int year=sc.nextInt();
		
		System.out.println("월= ");
		int month=sc.nextInt();
		
		//Calendar 5객체
		Calendar date = Calendar.getInstance(); //지금 현재
		date.set(year, month -1, 1); //입력받은 년월일로 날짜 정보를 변경한다.
		
		int week = date.get(Calendar.DAY_OF_WEEK); // 1일에 대한 요일 구하기
		
		// 마지막 날을 구한다. 30(4,6,9,11),31(1,3,5,7,8,11,12),28,29
		/*int lastDay = 31;
		switch(month) {
		case 4: case 6: case 11: lastDay = 30;
		case 2:
			//윤년: 29, 그 외 년도 28
			//윤년의 기준은 4의 배수의 해이면서 100의 배수는 아닌 해
			//400의 배수이면 무조건 윤년
			
			if(year%4==0 && year%100!=0	|| year%400==0) {
				lastDay = 29;
				}else {
					lastDay= 28;
				}
			*/
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);// api의 매소드를 이용한 마지막날 구하기
		//출력
			System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
			for(String t : title) {
				System.out.print(t+"\t");
			}
			System.out.println(); // 줄바꿈
			
			//요일을 이용하여 공백처리
			for(int i=1; i<week; i++) {
				System.out.print("\t");
			}
			
			//날짜 출력
			for(int i=1; i<=lastDay; i++) {
				System.out.print(i+"\t");
				
				if((week-1+i)%7==0) {
					System.out.println();
				}
			}			
		}		
	}

