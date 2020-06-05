package ch2;

public class ArithmeticEX1 {
	public static void main(String[] args) {
		int b1=10, b2=20;
		int result = b1+b2;
		System.out.printf("b1 + b2 = %d\n", result);
		
		result = b2-b1;
		System.out.printf("b2 - b1 = %d\n", result);
		
		result = b1 * b2;
		System.out.printf("b1 * b2 = %d\n", result);
		
		result = b2 / b1;
		System.out.printf("b2 /b1 = %d\n", result);
		
		result = b1 % b2; // % 나머지 (몫 : 0, 나머지 10)
		// 10/20 =나머지값    20/10=나머지값
		System.out.println("b1 % b2 = "+ result);
		System.out.printf("b1 %% b2 = %d", result);

	}

}
