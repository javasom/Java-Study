

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

// 클라이언트
public class ClientSocketTest {

	public ClientSocketTest() {
		
	}
	public void clientStart() {
		try {
			InetAddress ia = InetAddress.getByName("192.168.1.199");
		
			// Socket 클래스는 객제를 생성하면 서버와 접속이 완료
			Socket s = new Socket(ia, 20000);
			
			System.out.println("서버에 접속되었습니다.");
			
			//서버가 보낸 정보 받기
			InputStream is = s.getInputStream();// 1byte
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String inputData = br.readLine();
			System.out.println("서버가 보낸 문자(받은 문자)----> "+ inputData);
			
			//클라이언트가 서버로 데이터 보내기
			PrintWriter pw = new PrintWriter (new OutputStreamWriter (s.getOutputStream(), "UTF-8"));
			
			pw.println("client가 서버에 보내는 문자");
			pw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ClientSocketTest().clientStart();

	}

}
