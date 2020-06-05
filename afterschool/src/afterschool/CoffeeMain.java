package afterschool;

public class CoffeeMain {

	public static void main(String[] args) {
		// 800원은 커피가 몇잔일까요를 구하는 프로그램 작성
		// 커피 한잔의 가격 200원
		int a = 800;
		int b = 200;
		// 800원 변수 선언, 200원 변수 선언
		// 현재 가지고 있는 돈이 0보다 큰지 확인한 후
		// 커피 잔 수 구하기
		int cups =0;
		if(a>0) {
			cups =a/b;
		}else if(a ==0) {
			cups = 0;
		}else {
			cups =-1;
		}
	
		// 가지고 있는 돈이 0이면 커피 잔수는 0이 출력되도록 하고
		// 가지고 있는 돈이 없다면 -1이 출력되도록 한다
		if(cups>0) {
			System.out.println("커피" +cups+"잔 입니다");
		} else {
			System.out.println("액수가 모자랍니다");
		}
	}
}