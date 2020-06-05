package ch2;

public class OperatorEx2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		// x= x+1; == x++
		System.out.println("x = "+(x++));
		/*
		 * System.out.println("x= "+x);
		 * x=x+1;
		 */
		System.out.println("y = "+(y++));
		System.out.println("x = "+x+", y = "+y);
	

	}

}
