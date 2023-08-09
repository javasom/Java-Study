package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public FileCopy() {
		
	}
	public void start() {
		// C:\\javaFileTest\natural.jpg	읽기
		// C:\\newFolder\natural.jpg	쓰기
		
		try {
			File source = new File("C:\\\\javaFileTest\\natural.jpg");
			File target = new File("C:\\\\newFolder", "natural2.jpg");
			
			// 1. 입력 스트림(byte) 만들기
			FileInputStream fs = new FileInputStream(source); 
			FileOutputStream fo = new FileOutputStream(target);
			
			/*
			while(true) {
				int byteData = fs.read(); //읽기 EOF: -1
				if(byteData==-1) {break;}
				fo.write(byteData);		
			}
			*/
			// 배열을 이용한 입출력
			// 읽기
			byte[] data = new byte[(int)source.length()];
			fs.read(data, 0, data.length);
			
			fo.write(data, 0, data.length);
			
			fs.close();
			fo.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new FileCopy().start();
	}
}
