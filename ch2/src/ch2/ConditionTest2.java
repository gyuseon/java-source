package ch2;

public class ConditionTest2 {

	public static void main(String[] args) {
		char ch1 = 'z';
		//ch1이 영문자(대문자 또는 소문자)이거나
		//숫자일 때만 변수 b의 값이 true 가 나오는
		//프로그램 작성하기
		boolean b = (ch1>='A' && ch1<='Z') ||
				    (ch1>='a' && ch1<='z') ||
				    (ch1>='1' && ch1<='9') ? true : false;
		System.out.println(b);
		
//		b  =(ch1>=65 && ch1<= 90) ||
//	        (ch1>=97 && ch1<=122) ||
//	        (ch1>=48 && ch1<= 57) ? true : false;
//		System.out.println(b);
	    
		
		

	}

}
