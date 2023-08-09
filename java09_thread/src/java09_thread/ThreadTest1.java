package java09_thread;
// Thread 처리를 하는 클래스 만드는 방법 1
// Thread 클래스를 상속받아
//스레드 구현하는 코드를 run()메소드 오버라이딩을 한다.
// start()를 호출해준다.
public class ThreadTest1 extends Thread{
	int num = 1;
	String name;
	public ThreadTest1() {
		
	}
	public ThreadTest1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(name+"-->"+ num++);
		}
	}
	
	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("첫 번째 스레드");
		ThreadTest1 tt2 = new ThreadTest1("두 번째 스레드");
		
		tt1.start(); //스레드의 시작
		
		tt2.start(); //실행 안 됨.

	}
	
		
		
	}


