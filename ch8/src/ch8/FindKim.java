package ch8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKim {

	public static void main(String[] args) {
		String names[]= {"Queen","Tod","Kim","Park","Choi"};
//		List<String> fruits =new ArrayList<String>(Arrays.asList(names));
//		System.out.println(fruits);
//		System.out.println(names);
		System.out.println(findKim(names));

	}
	
	
	public static String findKim(String names[]) {
		//넘겨받은 배열에서 Kim 이라는 문자열의 위치를 찾아
		//Kim 은 3번째 위치에 있다 라는 문자열을 리턴하는
		//메소드 작성하기
		 int pos=0;
//		for(int i=0;i<names.length;i++) {
//			if(names[i].equals("Kim")) {
//				pos = i;
//				break;
//			}
//		}
//		
		
		pos =Arrays.asList(names).indexOf("Kim");
		return "kim 은 " +(pos+1)+" 번째 위치에 있다";
	}

}
