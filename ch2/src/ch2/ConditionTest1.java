package ch2;

import java.util.Scanner;

public class ConditionTest1 {

	public static void main(String[] args) {
		//사용자가 입력한 숫자가 양수,음수,0인지
		//구분하는 프로그램 작성
		//삼항 연산자
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num = sc.nextInt();
		
		String result=num ==0 ? "0" : num >=1 ? "양수":"음수";
		System.out.println(result);


	}

}
