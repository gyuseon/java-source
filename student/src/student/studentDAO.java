package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentDAO {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e)  {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con =null;
		
		String url="jdbc:mysql://localhost:3306/javadb?"
				+"useSSL=false&serverTimezone=UTC";
		
		String user="javadb";
		String password ="12345";
		try {
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public int insertStudent(int no,String name,int grade,String birth) {
		int result=0;
		
		String sql="insert into student(no,name,grade,birth) values(?,?,?,?)";
		
		try (Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setInt(3, grade);
			pstmt.setString(4, birth);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public StudentVO getUser(int no) {
		
		String sql= "select * from student where no=?";
		StudentVO vo=null;
		try (Connection  con = getConnection();
			PreparedStatement pstmt =con.prepareStatement(sql)){
				
				pstmt.setInt(1, no);
				
				ResultSet rs =pstmt.executeQuery();
				if(rs.next()) {
					vo=new StudentVO();
					vo.setNo(rs.getInt("no"));
					vo.setName(rs.getString("name"));
					vo.setGrade(rs.getInt("grade"));
					vo.setBirth(rs.getString("birth"));
				
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	public List<StudentVO> getList(){
		List<StudentVO> list= new ArrayList<StudentVO>();
		
		String sql="select * from student";
		
		try (Connection con  =getConnection();
			PreparedStatement pstmt =con.prepareStatement(sql)){
			
			ResultSet  rs =pstmt.executeQuery();
			
			while(rs.next()) {
				StudentVO vo= new StudentVO();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setGrade(rs.getInt("grade"));
				vo.setBirth(rs.getString("birth"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

}
