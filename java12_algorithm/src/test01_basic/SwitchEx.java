package test01_basic;

public class SwitchEx {
	
	static void process(String[] a) {
		// int보다 작은 데이터형 - byte, short, char, String
		String grade= "";
		switch(a[1]) {
		case "A" : grade = "Glod"; break;
		case "B" :
		case "C" : grade = "Silver"; break;
		default : grade = "Bronze";
		}
		System.out.println(a[0]+ "은 "+a[1]+"학점 입니다");
		System.out.println("등급은 "+grade+"입니다.");
}
//						args[0]="홍길동", args[1]="A"
public static void main(String[] args) {
		process(args);
	}
}

/*
args로 데이터를 입력받아 다음과 같이 출력하시오(switch)
> java SwitchEx 홍길동 A

[조건]
A는 Gold
B,C는 Silver
나머지는 Bronze

[출력]
홍길동은 A학점 입니다
등급은 Gold입니다



*/