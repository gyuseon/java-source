package afterschool;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// 사각형의 가로 및 세로 길이를 입력받아
		// 사각형의 넓이와 둘레를 구하는 프로그램 작성
		// 넓이는 : 가로*세로
		// 둘레는 : 2*(가로+세로)
		// 가로와 세로는 변수 사용하기
		
		Scanner sc = new Scanner(System.in); // 시스템은 위에서 아래로
		
		System.out.printf("가로길이 : ");
	    int a =sc.nextInt();
	    System.out.printf("세로길이 : ");
	    int b =sc.nextInt();
	    System.out.println("넓이는 : "+a*b);
	    
	    System.out.println("둘레는 : "+2*(a+b));
		

	}

}
