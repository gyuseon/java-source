package action;

import java.util.List;
import java.util.Scanner;

import service.StudentListService;
import student.StudentVO;

public class StudentListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		StudentListService service = new StudentListService();
		List<StudentVO> list=service.getList();
		
		System.out.println("====== 학생정보 전체 조회=====");
		System.out.println("학번\t이름\t학년\t생일");
		
		for(StudentVO vo: list) {
			System.out.print(vo.getNo()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getGrade()+"\t");
			System.out.print(vo.getBirth()+"\n");
			
		}

	}

}
