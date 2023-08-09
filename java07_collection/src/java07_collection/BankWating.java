package java07_collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BankWating {
	public static int count = 1; // 번호를 카운트할 변수
	// 손님 정보(도착 날짜, 시간, 부여받은 번호) vo객체를 담을 Queue 기능이 있는 컬렉션 객체 생성
	public static LinkedList<PersionVO> watingList = new LinkedList<PersionVO>();
	Scanner sc = new Scanner(System.in);
	public BankWating() {
	}
	public void bankStart() {
		while(true) {
			System.out.print("메뉴[1. in(손님),  2.out(은행원)] 선택-> ");
			String menu = sc.nextLine();
			switch(menu) {
			case "1" : inGuest(); break;
			case "2" : outGuest(); break;
			default:
				System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}	
	}
	// 번호표를 뽑을 때
	public void inGuest() {
		Calendar now = Calendar.getInstance();
		//손님 정보가 있는 객체 생성		 번호
		PersionVO vo = new PersionVO();
		vo.setNum(count++);
		vo.setDateTime(now);
		
		//대기열에 추가하기
		watingList.offer(vo);
		//																E: 요일
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd hh:mm (E)");
		String nowTxt = fmt.format(now.getTime());
		// Message 출력					vo객체의 수
		System.out.println("대기인 수 :"+ watingList.size() + "-->날짜 : "+ nowTxt+ ", 번호 : "+ vo.getNum());
	}
	// 호출되었을 때
	public void outGuest() {
		try {
			//1. 먼저 입력된 객체를 가지고 나오면
			PersionVO vo = watingList.pop();
			System.out.println("대기인 수: "+ watingList.size()+", 호출 번호 : "+vo.getNum());
		}catch(NoSuchElementException ne) {
			System.out.println("대기자가 존재하지 않습니다.");
		}
		
	}

	public static void main(String[] args) {
		BankWating bw = new BankWating();
		bw.bankStart();
	}

}

/*
  
실행
메뉴[1. in(손님),  2.out(은행원)]? 1
대기인수 : 1 --> 날짜: 2023-08-03 10:39, 번호: 1

메뉴[1. in(손님),	 2.out(은행원)]? 1
대기인수 : 2 --> 날짜: 2023-08-03 10:45, 번호: 2

메뉴[1. in(손님),	 2.out(은행원)]? 2
대기인수 : 1 --> 호출 번호 : 1

메뉴[1. in(손님),	 2.out(은행원)]? 1
대기인수 : 2 --> 날짜: 2023-08-03 10:55, 번호: 3

:
:

*/