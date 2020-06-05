package ch9;

public class BoxEx2 {

	public static void main(String[] args) {
		// 지네릭스 - 타입안정성 / 타입체크와 형변환 생략이 가능하므로 코드 간결
		
		Box2<String> box1 =new Box2<String>();
		
		box1.setItem("홍길동"); 
		System.out.println(box1.getItem());
		

	}

}
