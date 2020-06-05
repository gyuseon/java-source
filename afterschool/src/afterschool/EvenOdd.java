package afterschool;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 사용자로부터 숫자를 입력받아
		// 그 숫자가 짝수인지 홀수인지 구별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int i =sc.nextInt();
		
		if(i%2==0) {
			System.out.println("짝수 ");
		}else {
			System.out.println("홀수 ");
		}

	}

}
