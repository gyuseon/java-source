package classtest;

public class Method1 {
	//매개변수는 없고 리턴하는 것도 없는 메소드
	void method1() {}
	//정수 매개변수를 하나 받아들인 후 리턴하지 않는 메소드
	void method2(int x) {}
	//매개변수는 없고 정수를 리턴하는 메소드
	int method3() {
		return 3;
	}
	//정수 매개변수를 두개 받아들인 후 정수타입을 리턴하는 메소드
	int method4(int x,int y) {
				
        return x+y;
	}
	
	//정수형 배열 매개변수를 하나 받아들인 후 정수타입 리턴하는 메소드
	int method5(int arr[]) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	
	//문자열 배열 매개변수 하나를 넘겨받아 문자열을 리턴하는 메소드
	String method6(String[] str) {
		//배열안의 문자열 요소를 모두 연결해서 리턴
		String sum="";
		for(String i:str) {
			sum+=i;
		}
		return sum;
	}
	
	//Box 매개변수를 하나 인자로 받고
	//리턴 타입은 없는 메소드
	void method7(Box box) {
		//box가 가지고 있는 메소드 getVolume을 호출하여 결과를 확인
		System.out.println(box.getVolume());
	}
	
	//Box 매개변수를 하나 인자로 받고 리턴타입은 Box로 하는 메소드
	Box method8(Box box) {
//		Box box1 =new Box(8,9,10);
//		return box1;
		return new Box(8,9,10);
		
	}

}
