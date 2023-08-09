package java05_exception;

public class MyException extends Exception{

	public MyException() {
		super("양의 정수를 입력해야 합니다.");
	}

	public MyException(String message) {
		//상위 클래스의 생성자 메소드 호출
		super(message);
	}
}
