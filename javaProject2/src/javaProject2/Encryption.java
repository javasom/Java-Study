package javaProject2;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("암호화된 문자열을 입력하세요.");
		String en = sc.nextLine();
		
		System.out.println("키 문자열을 입력하세요.");
		String key = sc.nextLine();
		
		
		int prev = 0;
		
		for (int i=0; i<key.length();i++) {
			
			char key_ = key.charAt(i);
			// key 문자열에 대해서  for 루프를 통한 반복작업 생성. 이 때 key_는 key문자열에서 순차적으로 하나씩 뽑는 알파벳.
			// key 문자열이 abc일 때 => i가 0일 때는 a, 1일 때는 b, 2일 때는 c
			int Idx_remove = en.indexOf(key_, prev); 
			// indexOf 함수는 문자열 en에서, prev 이후에 처음 등장하는 key_의 index를 찾음.
			// i가 0일 때 => 문자열 en에서 0번째부터 시작해 'a'가 처음으로 등장하는 index를 찾아 Idx_remove에 저장 => 처음엔 1
			
			// 그 다음 작업에서는 업데이트 된 en에서 1번째부터 시작해 'b'가 처음으로 등장하는 인덱스를 찾음. => 2
			// 그 다음 작업에서는 업데이트 된 en에서 2번째부터 시작해 'c'가 처음으로 등장하는 인덱스를 찾음.
			
			//System.out.println("key_ : " +  key_ + ", Idx_remove : " + Idx_remove);
			
			
			//System.out.println("en : "  + en);
			
			//System.out.println("en.substring(0, Idx_remove) : " +  en.substring(0, Idx_remove) + ", en.substring(Idx_remove+1) : " + en.substring(Idx_remove+1));
			en = en.substring(0, Idx_remove) + en.substring(Idx_remove+1); 
			// Idx_remove를 찾은 이후, 
			// en.substring(0, Idx_remove) 는 Idx_remove 앞에 위치한 문자열, en.substring(Idx_remove+1)는 Idx_remove 뒤에 위치한 문자열.
			//둘을 더해 사실상 Idx_remove만 제거된 새로운 문장 생성
			
			
			prev = Idx_remove;
		}
		
		System.out.println(en);
		
	}

}
