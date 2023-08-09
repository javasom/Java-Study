// 클래스명에 final이 있는 경우 현재 클래스는 상속이 안 됨.
//public final class TV {
public class TV {
	int size = 42; // 55->65
	int channel = 11; // 3
	int volumn = 12; // 15
	
	//상속됨,, 값을 변경할 수 없다.
	final int MAX_VOLUMN = 30;
	public TV() {
		size = 55;
		channel = 3;
		volumn = 15;
	}
	public void volumnUp() {
		volumn++;
		if(volumn>MAX_VOLUMN) {
			volumn = MAX_VOLUMN;
		}
	}
	//상속됨. 오버라이딩 불가
	public void volumnDown() {
		volumn--;
		if(volumn<0) {
			volumn= 0;
		}
	}
}
