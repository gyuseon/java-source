package ch3;

import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {
		//세개의 숫자를 입력 받은 후 가장 작은 수 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Input Num2 : ");
			int num2 = sc.nextInt();
			System.out.println("Input Num3 : ");
		int num3 = sc.nextInt();
		
		int min =num1;
		if(min > num2) {
			min = num2;
		}
		if(min > num3) {
			min=num3;
		}
			System.out.println("제일 작은 수 : "+min);
		

	}

}
