package afterschool;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// 원의 면적 구하기 3.14*r*r
		// double 변수를 하나 선언 반지름 값 담기
		
//	    double r =5.0d;
//	    System.out.println("원의면적 : "+3.14*r*r);
//	    System.out.println("원의 면적 : "+r*r*Math.PI);
	    
	    Scanner sc = new Scanner(System.in); //in 키보드 out 모니터
	    System.out.printf("반지름 값을 입력해 주세요 : ");
	    double r =sc.nextDouble();
	    System.out.println("원의 면적 : "+ r*r*Math.PI);
	    
	    
		

	}

}
