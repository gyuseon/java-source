package action;

import java.util.Scanner;

import service.StudentGetService;
import student.StudentVO;

public class StudentGetAction implements Action{
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("조회할 학생정보의 no를  입력해 주세요");
		int no =sc.nextInt();
		
		StudentGetService  service = new StudentGetService();
		StudentVO vo =service.getStudent(no);
		
		System.out.println("\n=== 학생정보  ===");
		System.out.println("no : "+vo.getNo()+"\t");
		System.out.println("이름 : "+vo.getName()+"\t");
		System.out.println("학년 : "+vo.getGrade()+"\t");
		System.out.println("생일 : "+vo.getBirth()+"\n");
		
	}

}
