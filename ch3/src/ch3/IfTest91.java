package ch3;

import java.util.Scanner;

public class IfTest91 {

	public static void main(String[] args) {
		//세개의 숫자를 입력 받은 후장 가 작은 수 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Input Num2 : ");
			int num2 = sc.nextInt();
			System.out.println("Input Num3 : ");
		int num3 = sc.nextInt();
		
		int max =num1;
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max=num3;
		}
			System.out.println("제일 큰 수 : "+max);
		

	}

}
