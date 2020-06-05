package arrays;

import java.util.Arrays;

public class ArraysEx4 {

	public static void main(String[] args) {
		//ascii => A(65),a(97)
		String arr[]= {"apple","good","height","piano","any","arm"};
		
		//정렬전
		System.out.println(Arrays.toString(arr));
		
		//정렬
		Arrays.sort(arr);
		
		//정렬후
		System.out.println(Arrays.toString(arr));

	}

}
