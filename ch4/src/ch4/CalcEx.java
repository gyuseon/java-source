package ch4;

public class CalcEx {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		//add 메소드 호출
		int result=calc.add(5, 7);
		System.out.println(result);
		
		result=calc.add(12, 6);
		System.out.println(result);
		
		result = calc.add(18, 19);
		System.out.println(result);
		
		System.out.println(calc.add(24, 35));
		
		//뺄셈
		System.out.println(calc.subtract(5, 3));
		System.out.println(calc.subtract(12, 24));
		System.out.println(calc.subtract(15, 6));
		
		//리턴없는 메소드 호출
		calc.powerOn();
		//System.out.println(calc.powerOn()); X
		
		//나눗셈
		System.out.println(calc.divide(10, 3));
	}
}















