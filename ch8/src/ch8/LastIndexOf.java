package ch8;

public class LastIndexOf {

	public static void main(String[] args) {
		String str1 = "HelloHelloHello World";
		
		System.out.println(str1.indexOf('l'));
		//찾기는 뒤에서부터 찾고 위치는 앞자리에서 잡아서 돌려줌
		System.out.println(str1.lastIndexOf('l'));

	}

}
