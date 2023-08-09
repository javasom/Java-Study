import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		

		int age;
		int gender;
		int height;
		int weight;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. : ");
		age = sc.nextInt();
		System.out.print("성별(1:남, 2:여)을 입력하세요. : ");
		gender = sc.nextInt();
		System.out.print("키를 입력하세요. : ");
		height = sc.nextInt();
		System.out.print("체중을 입력하세요. : ");
		weight = sc.nextInt();
		
		//표준체중 기준
		double std;
		if(age<=35) {
			if(gender==1) {
				std=(height - 100)*0.90;
			}
			else {
				std=(height - 100)*0.85;
			}
		}	
		else{
			if(gender==1) {
				std=(height - 100)*0.95;
			}
			else {
				std=(height - 100)*0.90;
			}
		}
		
		//표준체중 지수
		double std2=(weight/std)*100;
		
		String type;
		if(std2<=85) {
			type = "마른형";
		}
		else if (std2>86 && std2<=95) {
			type = "조금 마른형";
	
		}
		
		else if(std2>96 && std2<=115) {
			type = "표준형";
		}
		
		else if(std2>116&& std2<=125) {
			type = "조금 비만형";
		}
		
		else {
			type = "비만형";
		}
		
		//결과
		System.out.printf("\n표준체중 = %.2f\n", std);
		System.out.printf("당신의 표준체중지수는 %.2f으로 %s입니다.", std2,type);
		

	}
}




/*
 다음 기준에 맞는 프로그램을 작성하라.
 
 표준체중 기준
 35세 이하
  남성 : (키 - 100)*0.90
  여성 : (키 - 100)*0.85
 
 36세 이상
  남성 : (키 - 100)*0.95
  여성 : (키 - 100)*0.90
  
 표준체중 지수 = (현재체중/표준체중) * 100
 
 표준체중지수 평가기준
  마른형 : 85이하
  조금마른형 : 86~95
  표준형 : 96~115
  조금 비만형 : 116~125
  비만형 : 126 이상
  
 표준체중지수는 소수이하 2자리까지만 출력
 
 =============================
 실행결과
 나이 = 36
 성별(1:남성, 2:여성)=1
 키 = 180
 현재체중 = 70
 =============================
 처리결과
 표준체중 = 76
 당신은 표준체중지수는 92.10으로 조금마른형입니다.
  
*/

