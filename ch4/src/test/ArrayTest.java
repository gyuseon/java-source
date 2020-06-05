package test;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
//		int arr[] =new int[5];
		
		//배열선언
	    int arr[]=null;
	    //배열생성
//	    arr=new int[i];
//	    //배열 초기화
//		arr[0] = 15;
//		arr[1] = 20;
		
		
		
		
		
		// int형 배열을 선언 후
		// 사용자의 입력에 맞춰 배열을 생성한다
		Scanner sc =new Scanner(System.in);
		System.out.println("배열 입력 : ");
		int size = sc.nextInt();
		arr=new int[size];
		
		// 생성된 배열 요소의 초기화를 위해 사용자로부터
		// 값을 입력받고
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d 번째 요소 입력 : ",(i+1));
			arr[i]=sc.nextInt();
		}
		// 배열 전체 요소를 출력
		System.out.println("\n 생성된 배열 요소");
		for(int c : arr) {
			System.out.printf("%d\t",c);
		}

	}

}
