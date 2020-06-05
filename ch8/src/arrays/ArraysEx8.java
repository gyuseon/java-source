package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx8 {

	public static void main(String[] args) {
		//ascii => A(65),a(97)
		String arr[]= {"apple","good","height","piano","any","arm"};
		
		//정렬전
		System.out.println(Arrays.toString(arr));
		
		//정렬
		Arrays.sort(arr,Comparator.reverseOrder());
		
		//정렬후
		System.out.println(Arrays.toString(arr));

	}

}
