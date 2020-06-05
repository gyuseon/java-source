package ch2;

public class Trapezoid2 {

	public static void main(String[] args) {
		//사다리꼴의 넓이 구하기
		
		//윗변,아랫변,높이에 해당하는 변수를 선언한 뒤
		//계산한다. (윗변+아랫변)×높이÷2
		
		int top = 5;
		int bottom = 10;
		int height = 7;
		
		double result = (double)(top+bottom)*height /2;
		System.out.printf("사다리꼴 넓이 : "+result);

	}

}
