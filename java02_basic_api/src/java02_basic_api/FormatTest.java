package java02_basic_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {
		
	}
	public void start() {
		//오늘 날짜 -> 2023-07-31(월) 12:41 오전
		// 1. Calendar 객체 생성
		Calendar now = Calendar.getInstance();
		
		// simpleDateFormat : 원하는 형식(Format)객체를 만들기
		 SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm a");
	
		 //포멧에 날짜 셋팅
		 String fmtTxt = fmt.format(now.getTime());
		 System.out.println(fmtTxt);
		 
		 // 2. 숫자 데이터의 포멧 만들기
		 int numData = 25426442;	//	25,426,442원  $25,426,442원
		 //				23	  -	> 23원
		 //				43543 - > 43,543원
		DecimalFormat df = new DecimalFormat("#,###원");
		String decTxt = df.format(numData);
		System.out.println(numData+"--->"+decTxt);
		
		// 3. MessgeFormat : 데이터를 원하는 형식의 문자열로 만들기
		String username = "홍길동";
		String tel = "010-1234-5678";
		//	회원명: 홍길동		연락처: 010-1234-5678
		//					 포멧, Object, Object...
		String msgFmt = MessageFormat.format("회원명: {0}\t연락처: {1}\n주소: {2}", username, tel, "서울시 강남구");
		System.out.println(msgFmt);
	}

	public static void main(String[] args) {
		new FormatTest().start();
	}

}
