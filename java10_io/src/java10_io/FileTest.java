package java10_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		// File : 드라이브, 폴더 파일명으로 객체를 생성하여 파일 처리를 할 수 있는 클래스
		
		File f1 = new File("C://javaFileTest");
		File f2 = new File("C://javaFileTest/sql04_dml.sql");
		File f3 = new File(f1, "test.txt");
		
		// 폴더 생성하기
		File f4 = new File("C://newFolder");
		if(!f4.exists()) {// 폴더 존재 유무를 확인 : true->폴더가 있다 , false->폴더가 없다. !부정을 붙이기)
			if(f4.mkdir()) { // 하위 폴더가 없는 경우 , mkdirs() -> 하위 폴더까지 만들어야 할 경우
				System.out.println("폴더 생성");
			}else {
				System.out.println("폴더 생성 실패");
			}
		}
		try {
			// 파일 생성하기
			if(!f3.exists()) {
				if(f3.createNewFile()) {
					System.out.println("파일 생성");
				}else {
					System.out.println("파일 생성 실패");
				}
			}
			
			// 마지막 수정일
			long lastDate = f2.lastModified(); // 1970.1.1.0:0:0부터 날짜와 시간을 밀리초로 표시한다.
			
			Calendar now = Calendar.getInstance(); //현재
			now.setTimeInMillis(lastDate);
			
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String lastModified = fmt.format(now.getTime());
			System.out.println("마지막 수정일 : "+ lastModified);
			
			// 특정 드라이브의 폴더, 파일 목록을 구하기
			File f5 = new File("C://");
			File[] list = f5.listFiles();
			
			/*
			 getPath() : 경로 + 파일
			 getName() : 파일명
			 getAbsolutePath() : 경로 + 파일
			 getParent() : 경로
			 */
			
			for(File f : list ) {
				if(f.isDirectory()) {//폴더일 때
					if(f.isHidden()) {
						System.out.println(f.getPath()+ "[숨김 폴더]");
					}else {
						System.out.println(f.getPath()+ "[폴더]");
					}
				}else if(f.isFile()) {//파일일 때
					if(f.isHidden()) {
						System.out.println(f.getPath()+ "[숨김 파일]");
					}else {
						System.out.println(f.getPath()+ "[파일]");
					}	
				}
			}
			
			// 현재 시스템의 드라이브 목록 구하기
			File[] drive = File.listRoots();
			for(File f : drive) {
				System.out.println(f.getPath());
			}
			
			// 용량 확인
			long size = f2.length();
			System.out.println(f2.getName()+"파일 크기-> "+ size+ "byte");
			
			// 파일삭제
			boolean r = f3.delete();
			System.out.println("삭제 여부: "+ r);
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileTest();
	}
}
