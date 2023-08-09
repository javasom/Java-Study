import java.util.Arrays;

public class StringEx_1 {
	public static void main(String[] args) {
		// index : 0~3-1, 0~2 
		String[] strArr = {"가위", "바위", "보"}; // strArr[0] strArr[1] strArr[2]
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random() *3);
		System.out.println(strArr[tmp]); // 0~2
		}
	}
}