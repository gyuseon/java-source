package action;

import java.util.Scanner;

import service.UserUpdateService;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 사용자 정보를 입력하세요");
		System.out.print("번호입력 : ");
		int no =sc.nextInt();
		sc.nextLine();
		System.out.print("주소입력 : ");
		String address=sc.nextLine();
		
		UserUpdateService service = new UserUpdateService();
		
		System.out.println(service.update(no, address)>0?"수정 성공" :"수정 실패");

	}

}
