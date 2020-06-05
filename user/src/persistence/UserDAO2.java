package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.UserVO2;

//~DAO(Data Access Object) : 데이터베이스와 관련한 작업을 하는 클래스
//~VO2,~~DTO : 값들을 객체로 처리하는 클래스(바구니)
public class UserDAO2 {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		
		String user="javadb";
		String password="12345";
		try {
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}//getConnection close
	
	public int insertUser(String name,String birthyear, String address) {
		int result=0;
		
		String sql="insert into userTBL(name,birthyear,address) values(?,?,?)";
		
		try (Connection con = getConnection(); 
			 PreparedStatement pstmt =con.prepareStatement(sql)) {
			 
			pstmt.setString(1, name);
			pstmt.setString(2, birthyear);
			pstmt.setString(3, address);
			
			
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}//insertUser 종료
	
	public UserVO2 getUser(int no) {
		
		String sql= "select * from userTBL where no=?";
		UserVO2 vo2=null;
		try (Connection con = getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, no);
			
			//select = executeQuery
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				vo2=new UserVO2();
				vo2.setNo(rs.getInt("no"));
				vo2.setUsername(rs.getString("username"));
				vo2.setBirthyear(rs.getInt("birthyear"));
				vo2.setAddress(rs.getString("addr"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo2;
	}//getUser 종료
	
	public List<UserVO2> getList(){
		List<UserVO2> list =new ArrayList<UserVO2>();
		
		String sql="select * from userTBL";
		
		try (Connection con=getConnection();
			 PreparedStatement pstmt =con.prepareStatement(sql)){
			
			ResultSet rs =pstmt.executeQuery();
			
			
			while(rs.next()) {
				UserVO2 vo2 =new UserVO2();
				vo2.setNo(rs.getInt("no"));
				vo2.setUsername(rs.getString("username"));
				vo2.setBirthyear(rs.getInt("birthyear"));
				vo2.setAddress(rs.getString("addr"));
				list.add(vo2);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}//getList 종료
	
	public int updateUser(UserVO2 vo2) {
		int result =0;
		String sql="update userTBL set address=? where no=?";
		try(Connection con =getConnection();
			PreparedStatement pstmt =con.prepareStatement(sql)) {
			
			pstmt.setString(1, vo2.getAddress());
			pstmt.setInt(2, vo2.getNo());
			
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}//updateUser 종료
	
	public int deleteUser(int no) {
		int result=0;
		
		String sql = "delete from userTBL where no=?";
		try (Connection con =getConnection();
			 PreparedStatement pstmt =con.prepareStatement(sql)){
			
			pstmt.setInt(1, no);
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}//deleteUser 종료
	

}
