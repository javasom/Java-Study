package java10_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {
		
	}
	public void start() {
		// 파일에서 데이터 읽어오기
		try {
			File f = new File("C://javaFileTest", "sql04_dml.sql");
			FileReader fr = new FileReader(f); //한번에 1글자씩 읽어온다.
			BufferedReader br = new BufferedReader(fr);//1줄씩 읽어오기
			
			while(true) {
				String inData = br.readLine(); // EOF일 때 반환값은 null
				if(inData == null) break;
				System.out.println(inData);
			}
			
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileReaderTest().start();
	}
}
