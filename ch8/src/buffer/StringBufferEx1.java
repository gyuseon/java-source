package buffer;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer(20);
		StringBuffer buffer3 = new StringBuffer("hello World");
		StringBuffer buffer4 = new StringBuffer("hello World");
		
		System.out.println(buffer3==buffer4);
		System.out.println(buffer3.equals(buffer4));
		
		//StringBuffer => String 변환
		String str1 =new String(buffer3);
		String str2 =buffer4.toString();
		System.out.println(str1.equals(str2));
	}

}
// StringBuffer : 멀티스레드 지원
// Stringbuilder : 싱글스레드 지원
