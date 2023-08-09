import java.util.Arrays;

class ArrayEx5_4 {
	public static void main(String[] args) {
		
		//배열의 활용(3)
		//섞기 - 배열의 요소의 순서를 반복해서 바꾼다.(숫자 섞기, 로또번호 생성)
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));

		for (int i=0; i < numArr.length; i++ ) {
			int n = (int)(Math.random() * 10);  // 0~9 중의 한 값을 임의로 얻는다. index 0~9까지 10개
			int tmp = numArr[i];
			numArr[0] = numArr[n];				//numArr[9]과 numArr[n]의 값을 서로 바꾼다.
			numArr[n] = tmp;					//tmp=[0] -> [0]=[n] -> [n]=tmp
			System.out.println(Arrays.toString(numArr));
		}
	} // main의 끝
}

//		