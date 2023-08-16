import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public URLTest() {
		
	}
	public void startUrl() {
		try {	
			//				   프로토콜	 host		  파일				   변수	 값
			//URL url = new URL("https://auto.nate.com/news/articleView.html?idxno=38405");
			URL url = new URL("https://auto.nate.com/news/articleView.html?idxno=38405");
			
			
			//프로토콜, port, host명, 파일명
			System.out.println("프로토콜-> "+ url.getProtocol());
			System.out.println("포트 -> " +url.getPort());
			System.out.println("호스트명 -> " +url.getHost());
			System.out.println("파일명 -> " +url.getFile());
			System.out.println("데이터 -> " +url.getQuery());
			
			//============================================================================
			//1. url객체를 이용하여 URLConnection 객체를 구한다.
			URLConnection connection = url.openConnection();
			
			//2. URLConnection객체의 통신 채널 확보하기
			connection.connect();
			
			//3. pageHeader 정보 얻어오기
			String contentType = connection.getContentType();
			System.out.println(contentType);
			//	 01234567890123456789
			//	"text/html; charset=UTF-8",	"text/html;charset=UTF-8"
			
			int idx = contentType.indexOf("charset= ");
			String encode = contentType.substring(idx+8);
			
			//============================================================================
			InputStream is =  url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream(new File("C://javaFileTest","nete.html"));
			while(true) {
				String inData = br.readLine();
				if(inData==null) break;
				inData = inData+"\n";
				fos.write(inData.getBytes(), 0, inData.getBytes().length);
			//System.out.print(inData);
				
			}
			//읽어오기 완료
			br.close();
			isr.close();
			is.close();
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new URLTest().startUrl();

	}

}
