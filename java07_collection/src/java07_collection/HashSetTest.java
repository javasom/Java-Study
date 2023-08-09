package java07_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	//						0	  0		0  0	
	int data[] = {56,54,78,56,85,85,90,78,56,45};
	public HashSetTest() {
		//	Integer a =10;
		//	int b = a;
		
		// HashSet : 입력 순서 유지 안 함, 중복데이터 허용 안 함
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int d : data ) {
			hs.add(d);
		}
		System.out.println("size->"+ hs.size());
		
		// HashSet객체를 얻어오기
		Iterator<Integer> ii = hs.iterator();
		
		// hasNext() : 다음 객체 존재 유무 확인
		// next() :  객체를 얻오오기
		while(ii.hasNext()) {
			Integer obj = ii.next();
			System.out.println(obj);
		}
		
	}

	public static void main(String[] args) {
		new HashSetTest();
	}
}
