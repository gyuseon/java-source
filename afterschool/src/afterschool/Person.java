package afterschool;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// 사용자의 입력값이 1이거나 3이면 남자라고 출려
		// 사용자의 입력값이 2이거나 4이면 여자
		
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자 입력 " );
		int i =sc.nextInt();
		
		if(i==1 || i==3) {
			System.out.println("남자");
		}else  {
			System.out.println("여자");
		}
	}
}
		
