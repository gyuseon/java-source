package ch3;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// 사용자로부터 사칙 연산 기호 및두개의
		// 숫자를 입력받아 계산후 출력하는 프로그램 작성
		// +,-,*,/
		Scanner sc = new Scanner(System.in);
		System.out.println("필요한 사칙연산(+,-,*,/,%) 기호를 입력하세요.");
		String op = sc.nextLine();
		
		// 두개의 숫자 입력받기
		System.out.println("num1 : " );
		int num1 = sc.nextInt();
		System.out.println("num2 : ");
		int num2 = sc.nextInt();
		//switch~case(+,-,*,/,%)
		switch (op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;

		default:
			System.out.println("연산자 기호를 확인해주세요");
			break;
		}

	}

}
