package service;

import java.util.List;

import student.StudentVO;
import student.studentDAO;

public class StudentListService {
	public List<StudentVO> getList(){
		studentDAO dao = new studentDAO();
		return  dao.getList();
	}

}
