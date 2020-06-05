package action;

import java.util.Scanner;

import service.StudentAddService;

public class StudentAddAction implements Action{
	
	public void execute(Scanner sc) {
		
		sc.hasNextLine();
		
		System.out.println("학생 정보를 입력하세요");
		System.out.println("학번 :  ");
		int no=sc.nextInt();
			sc.nextLine();
		System.out.println("이름 :  ");
		String  name=sc.nextLine();
		System.out.println("학년 :  ");
		int grade =sc.nextInt();
		sc.nextLine();
		System.out.println("생일 :  ");
		String birth= sc.nextLine();
		
	
		StudentAddService service= new StudentAddService();
		
		System.out.println(service.insert(no,name,grade,birth)?"삽입 성공":"삽입 실패");
	}

}
