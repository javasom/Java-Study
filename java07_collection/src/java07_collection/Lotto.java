package java07_collection;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto { 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
	
		do {
			//게임수
			System.out.println("게임수=");
			int cnt = sc.nextInt();
		
			//입력받은 게임수 만큼 만들어 출력
			for(int i=1; i<=cnt; i++) {// cnt=3-> 1,2,3
				TreeSet<Integer> lotto = new TreeSet<Integer>();//번호 저장할 객체, 중복제거, 정렬
				int ran;//보너스 번호로 사용한다.
				while(true) {
					ran = random.nextInt(45+1); // 1~45 //현재까지 마지막 생성번호
					lotto.add(ran);
					if(lotto.size()>=7){
						//번호 7개 있으면 반복문 중지
					break;
				}
			  	
			}
			//ts에서 ran(보너스 번호)를 제거
			lotto.remove(ran);
				
			//출력
			System.out.print(i+"게임=");
			System.out.print(lotto.toString());//번호
			System.out.println(", 보너스="+ ran);//보너스
				
		}
	
		//계속 여부 확인
		System.out.print("계속 하시겠습니까? (1: 예, 2:아니오) -> ");
		int status = sc.nextInt();
		if(status==2) {
			break;
		}
		
		}while(true);
		
		
	} // main
	
} // class