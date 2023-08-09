import java.util.Arrays;		//ctrl+shift+o 자동으로 import문 추가

class ArrayEx5_0_2 {
	public static void main(String[] args) {
		//index범위 : 0~9
		
		int[] iArr = {100,95,80,70,60}; // 길이가 5인 int배열
		for(int i=0; i<iArr.length; i++) {
				System.out.println(iArr[i]);
		}
	
		System.out.println(Arrays.toString(iArr));
		
		
		
		
	}
}
