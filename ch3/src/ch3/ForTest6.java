package ch3;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		// 숫자를 입력받아 해당 숫자의 factorial 값 구하기
		
		// 5=> 5*4*3*2*1 =
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact*=i;//fact= fact*1			
		}
		System.out.printf("%d! = %d",num,fact );

	}

}
