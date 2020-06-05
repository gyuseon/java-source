package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx1 {

	public static void main(String[] args) {
		//InetAddress : 자바에서 IP 주소를 다루는 클래스
		try {
			InetAddress ip = InetAddress.getLocalHost();
			
			System.out.println("Hostname : "+ip.getHostName());
			System.out.println("Hostaddress : "+ip.getHostAddress());
			System.out.println("toString : "+ip.toString());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
