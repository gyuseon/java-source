package ch1;

public class CastingEx1 {
	public static void main(String[] args) {
		//Casting(강제형변환) : 큰 타입을 작은 타입에 담을 때 발생
		long longValue = 2147483648L;
		// int 형 범위 : -2147483648 ~ 2147483647
		int intValue = (int) longValue; //강제 형변환
		System.out.println(intValue);
		
		// char 범위 : 0~65535
		int intValue2 = 65533;
		char charValue = (char) intValue2;
		System.out.println(charValue);

	}

}
