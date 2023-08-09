

class ArrayEx5_0_1 {
	public static void main(String[] args) {
		//index범위 : 0~9
		
		int[] arr = new int[6]; //길이가 5인 int 배열 arr을 생성
		System.out.println("arr.length="+ arr.length);
		
		for(int i=0; i<arr.length; i++) { 
		//index 범위를 벗어나는 에러방지---> 배열이름.length
		System.out.println("arr["+i+"]=" + arr.length);	
		}
	}
}