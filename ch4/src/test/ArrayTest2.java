package test;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// Member 객체 배열을 생성
		Member members[] = null;
//		members[0] = new Member("홍길동","hong123");
//		members[1] = new Member("이길동","gong123");
//		members[2] = new Member("삼길동","jong123");
		
		
		// 사용자로부터 생성할(Member) 갯수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.printf("배열 생성 : ");
		// 입력받은 숫자만큼 Member객체 배열 생성
		int size =sc.nextInt();
		members = new Member[size];
		
		for(int i=0;i<members.length;i++) {
			System.out.printf("이름 : ",(i+1));
			String name =sc.next();
			System.out.printf("ID : ",(i+1));
			String id =sc.next();
			members[i]=new Member(name,id);
		}
		// 생성 후 출력
		System.out.println("출력 : ");
		for(Member c : members) {
			System.out.printf("이름 : "+c.name);
			System.out.printf("\tid : "+c.id);
		}

	}

}
