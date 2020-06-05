package test;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 피 연산자 입력 : ");
		int op1=sc.nextInt();
		System.out.println("+ - * / % 중에서 하나를 선택");
		String oper =sc.next();
		//next() 전에 있던거 무시 하고 현재값,nextLine() 줄 다 읽음
		System.out.println("두번째 피 연산자 입력 : ");
		int op2 =sc.nextInt();

	}

}
