package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

	private String title;   //상점 이름 보관
	private List<User> users = new ArrayList<User>();
	//private User[] users=new User[2];
	private List<Product> products = new ArrayList<Product>();
	//private Product[] products = new Product[5];
	private Scanner sc = new Scanner(System.in);
	private List<Product> carts = new ArrayList<Product>();
	//private Product[] carts = new Product[10]; //장바구니
	private String selUser;  //메인화면에서 선택된 사용자 값 담는 변수
	
	@Override
	public void setTitle(String title) {		
		this.title = title;
	}
	@Override
	public void genUser() {		
		//User 객체를 사용하여 쇼핑몰 이용자 생성
		users.add(new User("홍길동",PayType.CARD));
		users.add(new User("성춘향",PayType.CASH));
	}

	@Override
	public void genProduct() {		
		//CellPhone(3),SmartTV(2) 객체를 사용해서 제품 생성
		products.add(new Cellphone("갤럭시노트11", 1500000, "SKT"));
		products.add(new Cellphone("LG X-500", 700000, "LG"));
		products.add(new Cellphone("아이폰 11", 900000, "KT"));
		products.add(new SmartTV("삼성울트라HD", 2500000, "4K"));
		products.add(new SmartTV("LG스마트", 1400000, "1080p"));		
	}

	@Override
	public void start() {		
		System.out.println(title+" : 메인화면 - 계정 선택");
		System.out.println("===================================");
		
		int i=0;
		for(User user:users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
		System.out.println("[X] 종료");
		System.out.print("선택 : ");
		
		String input = sc.next();  //input => 0,1,X
		
		//0,1 이면 productList 메소드를 호출
		//X이면 현재 프로그램 종료
		switch (input) {
		case "0":case "1":
			System.out.println("### "+input+" 선택 ###");
			selUser = input;
			productList();
			break;
		case "x":case "X":
			System.out.println("shop을 종료합니다.");
			break;
		default:
			System.out.println("\n입력 값을 확인해 주세요\n");
			start();
			break;
		}		
	}
	
	public void productList() {
		System.out.println("\n"+title+" : 상품목록 - 상품 선택");
		System.out.println("======================================");
		int i=0;
		for(Product p:products) {
			System.out.printf("[%d]",i++);
			p.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String sel = sc.next();  //상품번호,h,c 
		
		// 상품번호가 입력되면 장바구니에 해당 상품 담기
		// h 가 입력되면 메인화면 보여주기
		// c 가 입력되면 checkOut()  메소드를 호출		
		switch(sel) {
			case "h" :
				start();
				break;
			case "c":
				checkOut();
				break;
			case "0":case "1":case "2":case "3": case "4":
						carts.add(products.get(Integer.parseInt(sel)));
						productList();
						break;
					
				
				
			default:
				System.out.println("메뉴를 확인해 주세요");
				productList();
		}
	}
	
	public void checkOut() {
		//장바구니에 담아놓은 제품 목록 보여주기
		System.out.println("\n"+title+" : 체크아웃");
		System.out.println("======================================");		
		int i=0;
		int sum=0;
		for(Product p:carts) {
			if(p!=null) {
				System.out.printf("[%d] %s (%d)\n",i++,
						p.getPname(),p.getPrice());
				sum+=p.getPrice();
			}
		}
		System.out.println("결제방법 : "+
					users(Integer.parseInt(selUser)).getPayType());
		System.out.println("합계 : "+sum);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");		
		String input = sc.next();
		
		switch(input) {
			case "p":
				productList();
				break;
			case "q":
				System.out.println("결제완료 되었습니다.");
				break;
			default:
				checkOut();
		}
	}
	private User users(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
}




















