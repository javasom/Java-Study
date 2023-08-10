package java10_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		
	}

	public void start() {
		//객체를 파이로 쓰기 - 반드시 직렬화가 되어야 한다.
		// 				인터페이스 Serializable을 상속받다.
		DataVO vo = new DataVO();
		vo.setNum(7777);
		vo.setName("박태환");
		
		Calendar d = Calendar.getInstance();
		d.set(2024, 5, 19); // 2024/6/19
		vo.setDate(d);
		
		try {
			File f = new File("C://javaFileTest/object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(vo); // 객체를 파일로 쓰기
			
			oos.close();
			fos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ObjectOutputStreamTest().start();

	}

}
