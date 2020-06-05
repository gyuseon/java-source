package ch11;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	public static void main(String[] args) {
		try {
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/javadb?"
				+"useSSL=false&serverTimezone=UTC";
		
		String user="javadb";
		String password="12345";
		
		//연결 생성
		try (Connection con =DriverManager.getConnection(url,user,password)){
			if(con!=null) {
				System.out.println("연결되었습니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
