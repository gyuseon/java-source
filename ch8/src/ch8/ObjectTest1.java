package ch8;

public class ObjectTest1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// == (기본타입), equals() => String
		
		//object 를 비교할때 쓰는 ==,equals()는 같은 개념
		//주소비교
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		
		
		// toString() : 객체 문자 정보 (클래스명@16진수)
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
	}

}
