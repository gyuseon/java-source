package ch4;

public class StaticTest {
	public static void main(String[] args) {
		// print();  - ① print 메소드를 static 만들기
        //             ② 객체를 생성한 후 접근	
		
		StaticTest test = new StaticTest();
		test.print();
	}
	/*static*/ void print() {
		
	}
}
