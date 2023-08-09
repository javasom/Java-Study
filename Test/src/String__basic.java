
public class String__basic {

	public static void main(String[] args) {
		// String배열의 선언과 생성
		//String[] name = new String[3];  //3개의 문자열을 담을 수 있는 배열을 생성한다.
		//			name				name[0]	  name[1]	name[2]
		//		  [0x100]------------>[  null  ][  null  ][  null  ]   ---->참조형 기본값 null
		
		//String[] name = new String[] {Kim", "Park", "Yi"}; -----> String[] name = {Kim", "Park", "Yi"};
		// name[0] = "kim";
		// name[1] = "Park";
		// name[1] = "Yi";
		//			name				name[0]	  name[1]	name[2]
		//		  [0x100]------------>[  "Kim"  ][  "Park"  ][  "Yi"  ]  
		

		
		//String 클래스
		// 1. String 클래스는 char[]와 메서드(기능)을 결합한 것
		//		String클래스 = char[] + 메서드(기능)
		// 2. String 클래스는 내용을 변경할 수 없다.(read only)
		// 3. String substring (int from, int to)
		//		문자열에서 해당 범위(from~to)의 문자열 반환(to는 포함 안 됨)
		// 4. boolean equals (Object obj)
		//		문자열의 내용이 같은지 확인한다. 같으면 결과는 ture, 다르면 false
		// 5. char[]toCharArray()
		// 		문자열을 문자배열(char[])로 변환해서 반환한다. String->char[]
		
		//			   01234
		 String str = "ABCDE";
		 char ch = str.charAt(2); // C
		 String str2 = str.substring(1, 4); //BCD
		 String str3 = str.substring(1); //1~4
		 String str4 = str.substring(1, str.length()); //1~4
		 
		 System.out.println(str4);
	
	}
}