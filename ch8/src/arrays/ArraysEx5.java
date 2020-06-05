package arrays;

import java.util.Arrays;

public class ArraysEx5 {

	public static void main(String[] args) {
		//ascii => A(65),a(97)
		int arr[]= {'a','z','C','k','A','t','b','l','m'};
		
		//정렬전
		System.out.println(Arrays.toString(arr));
		
		//정렬
		Arrays.sort(arr);
		
		//정렬후
		System.out.println(Arrays.toString(arr));

	}

}
