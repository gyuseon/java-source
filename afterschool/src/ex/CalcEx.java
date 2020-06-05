package ex;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Input Num2 : ");
		int num2 = sc.nextInt();
		System.out.println("input operator : ");
		String op =sc.next();
		
		Calc calc=null;
		switch (op) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;

		default:
			break;
		}
		 calc.setValue(num1, num2);
		 System.out.println(calc.calculate());

	}

}
