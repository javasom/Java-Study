package java10_io;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.crypto.Data;

public class InputStreamTest {

	public InputStreamTest() {
		
	}
	public void start() {
		//InputStream : byte단위 입력 받는다.
		//				추상 클래스이므로 객체를 생성할 수 없다.
		//				System 클래스 멤버 변수 중 in 멤버 변수가 InputStream객체를 가진다.
		InputStream is = System.in;
		try {
			while(true) {
//				int readData = is.read(); // 입력 데이터가 없을 때 
//				if(readData==-1) break;
//				System.out.println(readData);
//				System.out.println((char)readData);
//				byte[] data = new byte[5];
//				// 한번에 5byte를 입력받아 data 배열에 담고 입력한 byte수를 리턴해 준다.
//				int cnt = is.read(data);
//				System.out.println(new String(data));
				byte[] data= new byte[5];
				int cnt = is.read(data, 0, 3);
				System.out.println(cnt+"-->"+ new String(data));
			}
			//System.out.println("-----------");
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new InputStreamTest().start();

	}

}
