package ch8;

public class Case {

	public static void main(String[] args) {
		// 소문자 -> 대문자, 대문자 ->소문자 ,공백 제거
		
		String str1="abcedfg";
		String str2="ABCDEFG";
		String str3="    abc 대한민국  ";
		
		System.out.println(str3.equals("abc 대한민국"));
		
		
	    System.out.println(str1.toUpperCase()); //대문자
		System.out.println(str2.toLowerCase());	//소문자	
		System.out.println(str3.trim());        //양쪽 공백 제거

	}

}
