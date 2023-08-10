package java11_net;

import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		
	}
	public void start() {
		// InetAddress : 현재 pc의 ip, 도메인의 ip를 얻을 수도 있다.
		try {
			// 내 컴퓨터의 ip구하기
			InetAddress ia1 = InetAddress.getLocalHost();
			System.out.println("ia1.address->"+ ia1.getHostAddress()); //ip얻기
			System.out.println("ia1.name-> "+ ia1.getHostName()); //url이 구해진다. 없으면 현재 컴퓨터 이름이 구해진다.
			
			// url주소를 이용하여 InetAddress객체 생성(www.nate.com, www.naver.com)
			InetAddress ia2 = InetAddress.getByName("www.nate.com");
			System.out.println("ia2.address-> "+ ia2.getHostAddress());
			System.out.println("ia2.name-> "+ ia2.getHostName());
			
			// ip를 이용하여 InetAddress객체 생성
			InetAddress ia3 = InetAddress.getByName("120.50.131.112");
			System.out.println("ia3.address-> "+ ia3.getHostAddress());
			System.out.println("ia3.name-> "+ ia3.getHostName());
			System.out.println("------------------------------------");
			// InetAddress전체 구하기
			InetAddress[] ia4 = InetAddress.getAllByName("www.naver.com");
			for(InetAddress ia : ia4) {
				System.out.println("address-> "+ ia.getHostAddress());
				System.out.println("name-> "+ ia.getHostName());
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new InetAddressTest().start();;

	}

}
