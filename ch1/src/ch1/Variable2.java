package ch1;

public class Variable2 {
	public static void main(String[] args) {
		//정수형 : 음의정수,양의정수, 02(8진수), 0x15(16진수)
		//-100, 128,
		
		//정수형 : byte(1byte), short(2byte)
		//         ★int(4byte)★, long(8byte)
		//자바에서는 정수형에서 거의 int 사용
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40;
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		//실수형 : 소수점, 지수
		// 0.25, -3.14, 지수= 5e7(e는 대소문자 상관없음), 0.12e-5
		// float, double
		
		//불린형(논리) : true, false
		// boolean
		
		//문자형 : 문자 하나 (' ')
		// 'A', 'a', '가'
		// char
		
		//문자열형 : 문자하나를 포함하여 여러문자 (" ")
		// "A", "ABC", "가", "안녕하세요"
		// String
	}

}
