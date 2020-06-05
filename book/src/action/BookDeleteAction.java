package action;

import java.util.Scanner;

import service.BookDeleteService;

public class BookDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 코드를 입력하세요");
		String code = sc.nextLine();
		
		BookDeleteService service = new BookDeleteService();
		
		System.out.println(service.delete(code) > 0? "삭제성공" : "삭제실패");

	}

}
