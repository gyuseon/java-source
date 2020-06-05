package action;

import java.util.Scanner;

import service.BookUpdateService;

public class BookUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 사용자 정보를 입력하세요");
		System.out.println("코드 입력 : ");
		String code = sc.nextLine();
		
		System.out.println("수정할 가격입력 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		BookUpdateService service = new BookUpdateService();
		
		System.out.println(service.update(code ,price) > 0? "수정성공" : "수정실패" );

	}

}
