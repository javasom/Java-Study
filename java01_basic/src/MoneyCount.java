import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 금액을 입력받아 화폐의 수를 출력하라.
		// 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1

		int won = 50000; //화폐단위 중 제일 큰 단위의 값
		int div = 5 ; //다음 화폐단위를 만들기 위한 값
		
		System.out.print("금액을 입력하세요="); //금액입력
		int money = sc.nextInt(); // 254832
		
		while(money>0) {
			int cnt = money/won; // 화폐수 5
			if(cnt>0) {
				String danwi = "개";
				if(won>=1000) {//갯수 뒤에 표시할 단위 (장, 개)
					   danwi = "장";
			}
			
				System.out.printf("%d원=%d%s\n", won, cnt, danwi);
				
			}
			//출력
			
			
			//===다음 금액 계산을 위한 준비===
			money -= (cnt * won); //계산 금액만큼 빼기 4832
			won = won / div; //화폐단위 변경 10000
			
			if(div==5) // 다음 화폐 단위를 만들어 값을 변경
				div=2;
			else
				div=5;
			}
		}
	}


/*
실행
금액을 입력하세요=254832
50000원=5장
1000원=4장
500원=1개
100원=3개
10원=3개
1원=2개
*/
