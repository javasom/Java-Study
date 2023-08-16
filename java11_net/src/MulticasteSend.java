/*
 224.0.0.0 ~ 239.255.255.255
 
 224.100.100._	15

 */

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticasteSend {

	public MulticasteSend() {
		
	}
	public void MulticasteSendStart() {
		String msg = "멀티캐스트를 이용한 데이터 전송하기 연습 중!";
		try {
			MulticastSocket ms = new MulticastSocket();
			
			InetAddress ia = InetAddress.getByName("224.100.100.15");
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 15000);
			
			ms.send(dp);//공용 아이피로 정보 보내기
			System.out.println("send 완료됨!");
			ms.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MulticasteSend().MulticasteSendStart();

	}

}
