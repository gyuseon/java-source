package ch8;

public class SubString {

	public static void main(String[] args) {
		String ssn ="880815-1234567";
		//문자열 잘라내기
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		System.out.println(ssn.substring(7));

	}

}
