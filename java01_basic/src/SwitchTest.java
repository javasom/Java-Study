import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// switch문 : 범위가 없는 조건문

		// 입력받은 값이 1:빨강, 2:파랑, 3:노랑, 4:초록, 그외의 값은 "잘못된 컬러 정보 입니다."
		
		System.out.print("색상 번호를 입력하세요.\n");
		int colorNum = sc.nextInt();
		
		switch(colorNum) {
		case 1:
			System.out.println(colorNum+"은 빨강입니다.");
			break;
		case 2:
			System.out.println(colorNum+"는 파랑입니다.");
			break;
		case 3:
			System.out.println(colorNum+"은 노랑입니다.");
		case 4:
			System.out.println(colorNum+"는 초록입니다.");
			break;
		default:
			System.out.println(colorNum+"은(는) 잘못된 컬러 정보 입니다.");
		
		}//switch
		
		
		
	}

}


/*
 	int형보다 작거나 같은 데이터형이어야 한다. (bytem, short, int, char), String
 	변수 or 수식 or 상수
 	
 	int a = 5
 	switch(a + 3){
 		case 상수:
 			실행문;
 			실행문;
 			break; <-생략가능
		case 상수:
			실행문;
			break;
		case 상수:
			실행문;
			실행문;
			break;
		default:   <-생략가능
			실행문;
 	}
 */