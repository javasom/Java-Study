import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FileUnicasteReceive {

	public FileUnicasteReceive() {
		
	}
	public void fileReceive() {
		try {
			DatagramSocket socket = new DatagramSocket(10200);
			//	512byte를 한번에 전송받을 패킷 객체 생성
			byte receiveData[] = new byte[512];
			DatagramPacket dp = new DatagramPacket(receiveData,receiveData.length);
			FileOutputStream fos = null;//쓰기 할 파일 객체
			
			while(true) {
				
				//받기
				System.out.println("전송받기 대기 중....");
				socket.receive(dp);
				
				byte[] data = dp.getData(); //전송받은 데이터
				int lng = dp.getLength();//전송받은 byte수를 구하기
				
				String txt = new String(data, 0, lng);
				System.out.println(lng);
				//						0123456789012345678
				//파일명 전송 : 파일 생성	**%$SendStart[natural1.jpg
				if(lng>=14 && txt.substring(0,14).equals("**%$SendStart[")) {
					//파일 생성
					fos = new FileOutputStream(new File("C://javaSrc", txt.substring(14)));
					System.out.println("파일 생성 됨!");
				}else if(txt.substring(0,14).equals("**%$SendStart[[")){//마지막 알림 : close
					fos.close();
					socket.close();
					System.out.println("전송받기 완료됨!");
					break;//반복문 중지
					
				}
				
				else if(lng>0){//내용 : 파일로 쓰기
					fos.write(data, 0, lng);
					
				}
				
			}//while
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileUnicasteReceive().fileReceive();

	}

}
