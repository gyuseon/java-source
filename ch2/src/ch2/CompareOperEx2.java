package ch2;

public class CompareOperEx2 {
	public static void main(String[] args) {
		int v2=1;
		double v3=1.0;
		System.out.println(v2 == v3);
		
		double v4=0.1d; //double이 더 정확하다 
		float v5=0.1f;
		System.out.println(v4==v5);
		System.out.println((float)v4==v5);

	}

}
