package service;

import student.StudentVO;
import student.studentDAO;

public class StudentGetService {

	public StudentVO getStudent(int no) {
		studentDAO dao = new studentDAO();
		return dao.getUser(no);
		}
}
