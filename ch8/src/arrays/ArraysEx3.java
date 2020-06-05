package arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		//ascii => A(65),a(97)
		String arr[]= {"강아지","동물","광고","피아노","다람쥐","테스트","노랑"};
		
		//정렬전
		System.out.println(Arrays.toString(arr));
		
		//정렬
		Arrays.sort(arr);
		
		//정렬후
		System.out.println(Arrays.toString(arr));

	}

}
