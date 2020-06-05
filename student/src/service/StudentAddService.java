package service;

import student.studentDAO;

public class StudentAddService {
	
	public boolean insert(int no,String name,int grade,String birth) {
		
		studentDAO dao= new studentDAO();
		int result=dao.insertStudent(no, name, grade,birth);
		return result>0?true:false;
	}

}
