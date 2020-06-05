package classtest;

public class MethodEx1 {

	public static void main(String[] args) {
		Method1 method =new Method1();
		
		//메소드 호출
		int arr[]= {5,6,7,8,9};
		method.method5(arr);
		System.out.println(method.method5(arr));
		
		String str[] = {"일","+","이","+","삼"};
		method.method6(str);
		System.out.println(method.method6(str));
		
		Box box = new Box(10,5,8);
		method.method7(box);
		
		
		
		method.method8(box);
		Box box1=method.method8(box);
		System.out.println(box1.getVolume());

	}

	
	

}
